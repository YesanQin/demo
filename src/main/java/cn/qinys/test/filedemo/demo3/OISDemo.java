package cn.qinys.test.filedemo.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * java.util.ObjectInputSteam
 * 该类的作用是读取一组字节（必须是由OOS将对象序列化后的一组字节），将其还原为对象。
 * @author soft01
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		/*
		 * 读取person.obj文件，将Person对象还原从字节到对象的过程称为对象的“反序列化”。
		 */
		FileInputStream fis=new FileInputStream("person.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		/*
		 * Object readObject()
		 * ObjectInputStream提供了一个方法，该方法可以从其处理的流中将字节读取回来并转换为
		 * 对象返回。只不过返回的时候以顶级父类Object形式。所以返回后需要自己造型。
		 * 该方法要求我们处理一个异常;
		 * ClassNotFoundException。该异常通常出现的原因是，读取的那一组字节并不能转换为对象。
		 * 这组字节不是由OOS的writeObject序列化的字节。
		 */
		Person p=(Person)ois.readObject();//返回的对象为Object类，将其强制转换为指定类型。
		System.out.println(p);
		ois.close();
	}
}
