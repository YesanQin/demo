package cn.qinys.test.filedemo.demo3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流：BifferedWriter
 * 由于内部维护了一个字符数组作为缓冲区，所以写出字符串的效率较高，而且还有一个特点就是
 * 可以以行为单位写出字符串。
 * PrintWriter：具有自动行刷新功能的缓冲字符输出流由于该流的缓冲功能是使用BufferedWriter实现
 * 的并且其提供了更多功能，所以比较常用。
 * 创建PrintWriter时，其总是先创建BufferedWriter作为缓冲功能。
 * @author soft01
 *
 */
public class PWDemo {
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		 /*
		  * 直接操作文件的构造方法
		  * PrintWriter（File file）
		  * PrintWriter(String pathname)
		  * 直接操作文件的这两个构造方法都支持第二个参数，就是指定字符集。
		  */
		 PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
		 pw.println("我爱北京天安门，");
		 pw.println("天安门上太阳升。");
		 pw.flush();
//		 pw.close();
		 
	 }
}
