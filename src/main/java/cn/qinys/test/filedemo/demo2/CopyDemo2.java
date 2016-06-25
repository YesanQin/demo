package cn.qinys.test.filedemo.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream src=new FileInputStream("fos.pdf");
		FileOutputStream desc=new FileOutputStream("fos_copy.pdf");
		byte[] data=new byte[1024*10];
		int len=-1;
		while((len=src.read(data))!=-1){
			desc.write(data,0,len);
		}
		src.close();
		desc.close();
		
	}
}
