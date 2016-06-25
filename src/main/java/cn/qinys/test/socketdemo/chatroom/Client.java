package cn.qinys.test.socketdemo.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 基于UDP通讯的客户端
 * 可以吧UDP理解为一个快递员
 */
public class Client {
	public static void main(String[] args) {
		try {
			/*
			 * 1、创建Socket 2、准备数据 3、准备地址（目标地址） 4、将数据和地址设置到包中 5、通过Socket发动包
			 */
			// 1 java.net.Datagramsocket
			DatagramSocket socket = new DatagramSocket();
			// 作为客户端的端口可以随机分配，重要的是服务端的端口必须要固定

			// 2
			String message = "你好，服务端！";
			// 将字符串按照UTF-8编码转换为字节
			byte[] data = message.getBytes("UTF-8");

			// 3
			InetAddress address = InetAddress.getByName("localhost");
			/*
			 * tcp与udp之间的端口是没有冲突的。 意思是，若一个程序开启了tcp的8088端口
			 * 那么当前程序打开udp的8088端口是没有问题的，前提是之前没有程序占用udp的8088
			 */
			int port = 8088;

			// 4 java.net.DatagramPacket
			DatagramPacket packet = new DatagramPacket(data, // 发送的数据对应的数组
					data.length, // 数组中多少字节被发动
					address, // 远端计算机地址
					port);// 远端计算机端口
			// 5
			socket.send(packet);

			// 接受服务端发送回来的消息
			// 2
			data = new byte[100];
			packet = new DatagramPacket(data, data.length);
			// 3
			socket.receive(packet);// 阻塞方法
			// 4
			// data=packet.getData();
			/*
			 * DatagramPacket的getLength方法可以得知这次实际接收到的字节量。
			 */
			message = new String(data, 0, packet.getLength(), "UTF-8");
			System.out.println("服务端说：" + message);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
