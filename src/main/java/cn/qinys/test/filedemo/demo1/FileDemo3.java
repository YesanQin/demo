package cn.qinys.test.filedemo.demo1;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args){
		/*
		 * 删除当前目录中的test.txt
		 */
		File file=new File("demo");
		if(file.exists()){
			file.delete();
			System.out.println("成功删除！");
		}
	}
}
