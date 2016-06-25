package cn.qinys.test.filedemo.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * 低级流，用于读取文件数据的流
 * @author soft01
 *
 */
public class FISDemo1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] data=new byte[200];
		int len=fis.read(data);
		String str=new String(data,0,len,"UTF-8");//String类的构造方法之一
		System.out.println(str);
		fis.close();
//		byte[] data1=new byte[20];
//		for(int i=0;i<data1.length;i++){
//			data1[i]=(byte)(Math.random()*256-128);
//		}
//		String str1=new String(data1);
//		System.out.println(str1);
		
		
	}
}







