package cn.qinys.test.filedemo.demo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileOutputStream;
 * 文件的字节输出流，用于向文件
 * @author soft01
 *
 */
public class FOSDemo1 {
	public static void main(String[] args) throws IOException{
		/*
		 * 默认创建的FOS是覆盖写操作。
		 * 该覆盖操作是在写内容前先将原文件中所有数据清除，然后重写写入新的内容。
		 */
		FileOutputStream fos=new FileOutputStream("fos.txt");
		/*
		 * 还支持一个重载的构造方法，第二个参数传入一个boolean值，若改值为true，则是追加
		 * 写操作，即：通过该流写出的数据会在当前文件的末尾写入。而不是将原来数据都清楚。
		 */
		FileOutputStream fos1=new FileOutputStream("fos.txt",true);
		String str="一步两步，一步一步像爪牙，像魔鬼的步伐。";
		byte[] data=str.getBytes();//将字符串转换为字节数组
		System.out.println(data.length);
		fos.write(data);
		fos1.write(data);
		/*
		 * 流使用完毕后也要关闭，释放资源！
		 */
		fos.close();//此句作用主要是告诉底层c语言相关操作停止，并释放资源，
		//否则c语言相关操作常驻内存之中，造成内存泄漏，影响机器性能！
	}
}
