package cn.qinys.test.socketdemo.chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	private Socket socket;

	public Client1() {
		try {
			System.out.println("�������ӷ���������ȴ�...");
			socket = new Socket("localhost", 8088);
			System.out.println(socket+"���ӷ������ɹ���������������������������");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void strat() {
		getServerMessageHandler serverHandler = new getServerMessageHandler();
		Thread t = new Thread(serverHandler);
		t.start();
		try {
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);// �Զ�����flush����
			Scanner scan = new Scanner(System.in);
			while (true) {
				String message = scan.nextLine();
				pw.println(message);
				// pw.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client1 client = new Client1();
		client.strat();
	}

	public class getServerMessageHandler implements Runnable {
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				while ((message = br.readLine()) != null) {
					System.out.println(message);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
