package cn.qinys.test.filedemo.demo2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf=new RandomAccessFile("demo.txt","r");
		/*
		 * int read（byte[] data）
		 * 一次性尝试读取给定的字节数组data的长度的字节量，并将这些字节存入该数组中，返回值为实际读取
		 * 到的字节量，若返回值为-1，表示读取到了文件末尾（EOF end of file）
		 */
		byte[] data=new byte[50];
		int len=raf.read(data);
		System.out.println("实际读取了"+len+"个字节");
		System.out.println(Arrays.toString(data));
		/*
		 * String提供了一个构造方法，允许我们将给定的字节数组中的字节转换为对应的字符串：
		 * String(byte[] data)
		 * 按照当前系统默认字符集将字节数组中所有字节转换为字符串。
		 * 
		 * String(byte[] data,int start,int len)
		 * 将当前字节数组中从star处开始的字节，连续取len个，然后将它们按照当前系统默认的字符集转换为字符串
		 */
//		String str=new String(data,0,len);
		String str=new String(data,0,len,"GBK");
		System.out.println(str);
		
		
		
		
		
		raf.close();
	}
}
