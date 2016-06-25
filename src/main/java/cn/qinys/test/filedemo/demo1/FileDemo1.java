package cn.qinys.test.filedemo.demo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.File
 * 该类用于描述文件系统中的一个文件或目录
 * File可以访问文件或目录的属性信息
 * File可以操作文件或目录
 * File可以查看一个目录有哪些子项
 * 
 * File不能访问文件内容！
 * @author soft01
 *
 */
public class FileDemo1 {
	public static void main(String[] args){
		/*
		 * 描述目录时应当注意两点：
		 * 1、尽量不用绝对路径，因为不同操作系统有差异
		 * 2、目录的层级分割符不要直接写“/”或“\”，因为不同系统也有差异，所以使用File
		 * 的常量：File.separaror就可以了
		 *  在eclipse中开发时，“.”这个当前目录的位置是在当前项目的根目录。
		 */
		File file=new File("."+File.separator+"demo.txt");
		/*
		 * 获取文件名
		 */
		String name=file.getName();
		System.out.println("文件名："+name);
		/*
		 * 获取文件大小（文件占用的字节量）
		 */
		long length=file.length();
		System.out.println("文件大小："+length+"字节");
		/*
		 * 判断当前File表示的文件或目录是否在硬盘中已经存在了
		 */
		boolean exists=file.exists();
		System.out.println("已存在"+exists);
		/*
		 * 获取最后修改时间1970年元旦到这一刻的毫秒差
		 */
		long date=file.lastModified();
		Date date1=new Date();
		date1.setTime(date);
		SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str1=sp.format(date1);
		System.out.println(str1);
		//是否是隐藏文件
		boolean isHidden=file.isHidden();
		//是否可读
		file.canRead();
		//是否可写
		file.canWrite();
		//是否可运行
		file.canExecute();
		
	}
}









