package cn.qinys.test.filedemo.demo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.util.BufferedReader
 * 缓冲字符输入流，特点：需要处理一个字符流，并且可以以行为单位读取字符串。
 * @author soft01
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 读取当前源文件，并将内容输出到控制台
		 */
		FileInputStream fis=new FileInputStream(
				"."+File.separator+
				"src"+File.separator+
				"day03"+File.separator+
				"BRDemo.java");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		/*
		 * String readLine()
		 * bufferedReader提供了该方法可以以行为单位读取字符串
		 * 该方法会顺序读取若干字符，直到遇到换行符为止，然后将换行符之前的所有字符串转换为一个
		 * 字符串返回。该字符串中不包含换行符！
		 * 若返回值为null，表示读取到文件末尾。
		 */
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		
	}
}





