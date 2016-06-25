package cn.qinys.test.filedemo.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.util.ObjectOutputStream
 * 该高级流的作用是将给定的java中的对象转换为一组字节
 * 然后通过其处理的流写出。
 * 将一个对象转换为一组字节的过程成为：对象的序列化
 * @author soft01
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		Person p=new Person();
		p.setName("苍老师");
		p.setAge(24);
		p.setGender("女");
		p.setSalary(1000000);
		List<String> otherInfo=new ArrayList<String>();
		otherInfo.add("写大字");
		otherInfo.add("是个演员");
		otherInfo.add("歌手");
		otherInfo.add("促进中日文化交流");
		p.setOtherInfo(otherInfo);
		/*
		 * 将该对象转换为一组字节然后写入文件，这里需要两个流的组合来实现：、
		 * 1、ObjectOutputStream
		 * 目的：可以将一个对象转换为一组字节
		 * 2、FileOutputStream
		 * 目的：可以将一组字节写入文件
		 */
		FileOutputStream fos=new FileOutputStream("person.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream提供了一个独有的方法
		 * void writeObject(Object o)
		 * 该方法会将给定的对象o转换为一组字节，然后在通过其处理的流写出
		 */
		oos.writeObject(p);
		System.out.println("序列化完毕！");
		oos.close();
		fos.close();
		
	}
}













