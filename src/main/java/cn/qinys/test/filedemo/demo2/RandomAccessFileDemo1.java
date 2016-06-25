package cn.qinys.test.filedemo.demo2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 批量写出数据
 * void write（byte[] dat）
 * 将给定的字节数组中的
 * @author soft01
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf=new RandomAccessFile("demo.txt","rw");
		String str="摩擦摩擦,是魔鬼的步伐.";
		/*
		 * 将字符串按照当前系统默认的字符集转换为一组字节
		 * 字符串String提供了一个方法：
		 * byte[] getBytes()
		 * 常见字符集：
		 * GBK：国标编码，中文2字节，英文1字节
		 * UTF-8：俗称万国码，中文3个字节，英文1个字节
		 *           该编码集中1-4个字节构成不同国家语言的文字
		 *           ISO8859-1：一个欧洲常用字符集，不支持中文。
		 * String提供了一个重载的getBytes（）方法，允许根据给定的字符集将当前字符串转换为对应的字节
		 * byte[] getBytes(String charsetName)
		 */
//		 byte[] data=str.getBytes();//此时默认按照UTF-8字符集编码，其中每个汉字占3个字节！
		 byte[] data1=str.getBytes("GBK");
		 System.out.println(data1.length);
		 //将给定的字节数组中所有字节一次性写入文件
		 raf.write(data1);
		 raf.close();
		
		
		
	}
}



