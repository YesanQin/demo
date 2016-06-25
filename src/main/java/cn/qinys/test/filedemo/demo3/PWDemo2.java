package cn.qinys.test.filedemo.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter可以处理其他流
 * 既可以处理字节流，也可以处理字符流。
 * 但是直接处理字节流的弊端在于，不能指定字符集。
 * 当创建PrintWrtiter并处理其他流时：
 * 即：构造方法第一个参数为流
 * 那么这些构造方法都支持第二个参数，是一个boolean值
 * 当该值为true时，PrintWriter就具有自动行刷新功能。
 * @author soft01
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		FileOutputStream fos=new FileOutputStream("pw1.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		/*
		 * 当第二个参数为true时，该PrintWriter就具有自动行刷新功能，即
		 * 每当调用println（）方法时，将字符串写出后子佛那个flush（）
		 * 需要知道：自动行刷新会提高写出次数，降低写出效率，但是可以提高写出的即时性。
		 */
		PrintWriter pw=new PrintWriter(osw,true);
		pw.println("我爱北京天安门");//自动flush（）；
		pw.close();
	}
}
