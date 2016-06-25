package cn.qinys.test.filedemo.demo2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流写出数据的注意事项
 * @author soft01
 *
 */
public class BOSDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("bos.txt");// 创建一个输出流
		BufferedOutputStream bos=new BufferedOutputStream(fos);//将输出流转换为缓冲流
		
		String str="我爱北京天安门";
		byte[] data=str.getBytes();
		bos.write(data);
		/*
		 * void flush()
		 * 该方法会强制将缓冲区中的数据一次性写出，不管缓冲区是否已经装满。频繁调用flush方法会
		 * 提高写出次数从而降低写出效率，但是会保证写出的即时性。
		 */
		bos.flush();
		bos.close();// 该方法也会自动调用的flush方法！
		
		
	}
}
