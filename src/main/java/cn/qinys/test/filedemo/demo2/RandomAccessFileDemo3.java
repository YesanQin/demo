package cn.qinys.test.filedemo.demo2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile总是基于指针当前位置进行读或写操作的。并且每当读或写完当前字节后，
 * 指针会自动向后移动。
 * @author soft01
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
		/*
		 * long getFilePointer()
		 * 获取当前RandomAccessFile的指针位置（指向文件中的第几个字节）
		 * 刚创建出来的RAF默认指向文件第一个字节。
		 * 下标从0开始
		 */
		long pos=raf.getFilePointer();
		System.out.println("pos:"+pos);
		raf.write(1);
		System.out.println(raf.getFilePointer());
		int max=Integer.MAX_VALUE;
		/*
		 * 因为write()方法只能写低8位，所以对于int值，需先进行右移操作才行，如下：
		 */
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println(raf.getFilePointer());
		raf.writeInt(max);
		System.out.println(raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println(raf.getFilePointer());
		raf.writeDouble(12.3);
		System.out.println(raf.getFilePointer());

		/*
		 * 读取上面写入的long值，我们需要先将指针移动到long值的
		 * 第一个字节处，然后连续读取8个字节将其读出来！
		 * void seek(long pos)
		 * 该方法可以将指针移动到指定位置
		 */
		raf.seek(9);
		long l=raf.readLong();//连续读取8个字节
		System.out.println(l);
		raf.close();
		/*
		 * 可以通过移动文件指针来指定想要读取的内容！
		 */
		
		
	}
}




