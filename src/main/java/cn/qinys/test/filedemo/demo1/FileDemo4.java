package cn.qinys.test.filedemo.demo1;

import java.io.File;

public class FileDemo4 {
	/*
	 * 当前项目根目录下创建目录demo
	 */
	public static void main(String[] args){
		File dir=new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("创建完毕！");
		}
	}
}
