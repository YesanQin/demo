package cn.qinys.test.filedemo.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.util.InputStreamReader
 * 字符输入流，特点：可以按照指定的字符集读取字符
 * @author soft01
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("osw.txt");
		//为了方便读取字符，可以使用字符输入流
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		int d=-1;
		while((d=isr.read())!=-1){
			char ch=(char)d;
			System.out.print(ch);
		}
		isr.close();
		
	}
}