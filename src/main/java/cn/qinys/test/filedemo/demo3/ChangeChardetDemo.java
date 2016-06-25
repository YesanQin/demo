package cn.qinys.test.filedemo.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ChangeChardetDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * osw.txt文件中的字符是以utf-8编码保存的，希望转换为GBK编码
		 * 思路：
		 * 以UTF-8编码读取该文件每一个字符，再以GBK编码写入另一个文件即可。
		 */
		FileInputStream fis=new FileInputStream("osw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		FileOutputStream fos=new FileOutputStream("osw_gbk.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
		int len=-1;
		char[] buf=new char[1024*5];
		while((len=isr.read(buf))!=-1){
			osw.write(buf,0,len);
		}
		System.out.println("转码完毕！");
		osw.close();
		isr.close();
	}
}
