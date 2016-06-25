package cn.qinys.test.filedemo.demo2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile src=new RandomAccessFile("test.pdf","r");
		RandomAccessFile desc=new RandomAccessFile("test_copy.pdf","rw");
		byte[] data=new byte[1024*10];//字节数组的大小决定一次性读取字节的量，此处一次性读10kb
		int len=-1;
		long start=System.currentTimeMillis();
		while((len=src.read(data))!=-1){
			//当读取字节量达到数组长度之后，自动进入循环体（即写入文件中）
			System.out.println(len);
			desc.write(data,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕！");
		System.out.println("用时："+(end-start)+"ms");
		src.close();
		desc.close();
	}
}
