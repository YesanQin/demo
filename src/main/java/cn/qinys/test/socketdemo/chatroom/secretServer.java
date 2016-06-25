package cn.qinys.test.socketdemo.chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class secretServer {
	Map<String, PrintWriter> allOut = new HashMap<String, PrintWriter>();
	ServerSocket server;
	Socket socket;

	public secretServer() {
		try {
			System.out.println("服务器已经启动，等待客户端连接...");
			server = new ServerSocket(8088);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized void addOut(String host, PrintWriter pw) {
		allOut.put(host, pw);
	}

	public synchronized void removeOut(String host) {
		allOut.remove(host);
	}

	public synchronized void sendMessageToAllClient(String message) {
		Collection<PrintWriter> pws = allOut.values();
		for (PrintWriter pw : pws) {
			pw.println(message);
		}
	}

	public synchronized void sendMessageToClient(String host, String message) {
		allOut.get(host).println(message);
	}

	public synchronized int sizeOut() {
		return allOut.size();
	}

	public synchronized boolean containKey(String host) {
		return allOut.containsKey(host);
	}

	public void start() {
		try {
			// 为了实现可以同时被多个客户端联系，需要使用多线程，此处线程的定义使用，线程与执行内容相互独立。
			// 首先定义每个线程执行的任务ClientHandler
			while (true) {
				socket = server.accept();
				System.out.println("一个客户端连接到服务端！");
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		secretServer server = new secretServer();
		server.start();
	}

	public class ClientHandler implements Runnable {
		private Socket socket;
		String host;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			InetAddress adress = socket.getInetAddress();
			host = adress.getHostAddress();
		}

		public void run() {
			PrintWriter pw = null;
			try {
				// 监听状态，阻塞状态，当检测到有客户端连接时就会产生一个socket与之通讯
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);

				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
				pw = new PrintWriter(osw, true);
				addOut(host, pw);
				sendMessageToAllClient(host + "上线了");
				sendMessageToAllClient("当前在线人数：" + sizeOut() + "人");
				String message = null;
				while ((message = br.readLine()) != null) {
					// 以@[ip地址]开头+要说的话，表示私密ip用户！
					if (message.trim().startsWith("@") && message.contains("[") && message.contains("]")) {
						String host1 = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
						if (containKey(host1)) {
							message = message.substring(message.indexOf("]") + 1);
							sendMessageToClient(host1, "用户" + host + "在私密你：" + message);
							pw.println("你在私密" + host1 + "用户:" + message);
						} else {
							pw.println("输入有误，用户" + host1 + "不存在！");
						}
					} else {
						sendMessageToAllClient(host + "说：" + message);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				removeOut(host);
				sendMessageToAllClient(host + "下线了！");
				sendMessageToAllClient("当前在线人数：" + sizeOut() + "人");
				try {
					if (socket != null) {
						socket.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
