package cn.qinys.test.filedemo.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Writer，Reader字符输出，输入流的父类。
 * 字符流特点：以字符为单位读写数据。
 * 字符流只能读写文本数据。所以不要用字符流读取非文本文件。
 * 字符流只是简化了我们对于字符串的读写操作，不用自行在字节与字符之间转换。
 * 所以字符流都是高级流，底层本质还是要用字节流读写数据。
 * @author soft01
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("osw.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		String str="我爱北京天安门，";
		/*
		 * 特点：
		 * 按照给定的字符集，将字符串转换为一组字节后次额出。
		 */
	   osw.write(str);
	   osw.write("天安门上太阳升。");
	   osw.close();
		//以前是先将字符串转换为字节数组再进行输入输出操作！
		

	}
}
