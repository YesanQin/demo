package cn.qinys.test.filedemo.demo1;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter文件过滤器（是一个接口）
 * 
 * File有一个重载的listFiles方法，允许我们传入一个文件过滤器，并将满足过滤器要求的
 * 子项返回，不满足的则忽略。
 * @author soft01
 *
 */
public class FileDemo8 {
	public static void main(String[] args){
		/*
		 * 获取当前目录下名字以“.”开头的文件或目录
		 */
		FileFilter filter=new FileFilter(){
			public boolean accept(File file) {
				System.out.println("正在过滤："+file.getName());
				return file.isDirectory();
			}
		};
		File file=new File(".");
		File[] files=file.listFiles(filter);
		for(File sub:files){
			System.out.println(sub.getName());
		}
		
		
	}
}




