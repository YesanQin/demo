package cn.qinys.test.filedemo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 该类用于读写文件数据。
 * 创建该类有两种常用模式：
 * 1、只读，对文件仅进行读取模式("r")  read
 * 2、读写，对文件数据读写("rw")  read,write
 * 常用构造方法：
 * RandomAccessFile(File file,String mode)
 * RandomAccessFile(String path,String mode)
 * @author soft01
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		/*
		 *对当前项目根目录下的文件test.dat文件进行操作 
		 */
		RandomAccessFile raf=new RandomAccessFile("test1.dat","rw");
		/*
		 * void write(int i)
		 * 该方法向文件中写出1个字节，即8位的二进制写的是该int值的二进制形式中的“低八位”
		 * 00000000 00000000 00000000 00000001
		 */
		raf.writeInt(4132541);
//		raf.write(258);
		raf.close();
		RandomAccessFile raf2=new RandomAccessFile("test1.dat","r");
		byte[] b=new byte[4];
		raf2.read(b);
		for(byte by:b){
			System.out.print(by+" ");
		}
		//
		//00000000 00111111 00001110 11000011
		/*
		 *读取test.dat文件中的第一个字节 
		 */
		RandomAccessFile raf1=new RandomAccessFile("test.dat","r");
		/*
		 * int read()读的是一个字节，返回的值在0-255之间
		 * 从raf当前指针位置读取该字节，若读取到了文件末尾会返回-1；
		 */
		int a=raf1.read();
		System.out.println(a);
		raf1.close();
		
		
	}
}











