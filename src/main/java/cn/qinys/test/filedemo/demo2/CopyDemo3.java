package cn.qinys.test.filedemo.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率完成复制操作
 * @author soft01
 *
 */
public class CopyDemo3 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("fos.pdf");
		FileOutputStream fos=new FileOutputStream("fos_copy222.pdf");
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int d=-1;
		/*
		 * BIS和BOS内部都有一个缓冲区（字节数组）
		 * 当我们调用bis.read()方法尝试读取一个字节时，
		 * BIS会尝试让FIS一次性读取若干字节回来，并存入内部的缓冲区，然后将第一字节返回。
		 * 这样当我们再次读取一个字节时，就直接将数组中的第二个字节返回了，而不是再去读取。
		 * 所以还是一次读取了若干字节，减少去读次数提高的读取效率
		 * 写出也是一个道理。当我们写出一个字节时，BOS是将字节放入内部维护的自己数组中，只有该数组存满了
		 * 才会让FOS将这一组字节一次性写入文件。
		 */
		long start=System.currentTimeMillis();
		while((d=bis.read())!=-1){//看似读了一个字节，实际上批量读了大量字节存入其缓冲区
			bos.write(d);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		/*
		 * 关闭流的时候，只需要关闭最外层的高级流就可以了
		 */
		bis.close();
		bos.close();
		
		
	}
}
