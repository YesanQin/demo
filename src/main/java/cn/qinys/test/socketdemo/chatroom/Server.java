package cn.qinys.test.socketdemo.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
	public static void main(String[] args) {
		try {
			/*
			 * 1、创建Socket 2、准备一个【接收包】 3、通过Socket接收数据并存入接收包中 这个过程做好后，包就有变化了：
			 * 1、包中就有数据了 2、包就记录了数据从哪里来的 4、从包中去除数据使用。
			 */
			// 1
			DatagramSocket socket = new DatagramSocket(8088);
			// 2
			byte[] data = new byte[100];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			// 3
			socket.receive(packet);// 阻塞方法
			// 4
			// data=packet.getData();
			/*
			 * DatagramPacket的getLength方法可以得知这次实际接收到的字节量。
			 */
			String message = new String(data, 0, packet.getLength(), "UTF-8");
			System.out.println("客户端说：" + message);

			// 2
			message = "服务端已收到信息！";
			// 将字符串按照UTF-8编码转换为字节
			data = message.getBytes("UTF-8");

			// 3
			InetAddress address = packet.getAddress();
			/*
			 * tcp与udp之间的端口是没有冲突的。 意思是，若一个程序开启了tcp的8088端口
			 * 那么当前程序打开udp的8088端口是没有问题的，前提是之前没有程序占用udp的8088
			 */
			int port = packet.getPort();

			// 4 java.net.DatagramPacket
			packet = new DatagramPacket(data, // 发送的数据对应的数组
					data.length, // 数组中多少字节被发动
					address, // 远端计算机地址
					port);// 远端计算机端口
			// 5
			socket.send(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

