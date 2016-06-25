package cn.qinys.test.filedemo.demo1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * @author soft01
 *
 */
public class CopyDemo {
	/*
	 * 
	 */
	public static void main(String[] args) throws IOException{
		RandomAccessFile src=new RandomAccessFile("fish.jpg","r");
		RandomAccessFile desc=new RandomAccessFile("mytest_copy.jpg","rw");
		int d=-1;
		long start=System.currentTimeMillis();
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end =System.currentTimeMillis();
		System.out.println("复制完成！");
		System.out.println("耗时："+(end-start)+"ms");
		//可以通过增加单次读取字节数来减少读取次数以降低整个读写过程的时间！
	}
}
