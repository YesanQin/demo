package cn.qinys.test.filedemo.demo1;

import java.io.File;

/**
 * 获取一个目录下的所有子项
 * @author soft01
 *
 */
public class FileDemo7 {
	public static void main(String[] args){
		/*
		 * 获取当前项目根目录下的所有子项
		 */
		File dir=new File(".");//表示当前项目的根目录
		/*
		 * File[] listFiles()
		 * 该方法会获取当前目录下的所有子项，由于一个目录下包含的无非还是文件或目录
		 * 那么都可以有一个File对象表示，所有获取一个目录里所有子项就等于获取了若干File
		 * 对象，每一个表示其中一个子项。
		 */
		File[] subs=dir.listFiles();
		for(File f:subs){
			//判断当前File表示的是否为一个文件
			if(f.isFile()){
				System.out.print("文件：");
				//判断当前File表示的是否为一个目录
			}else if(f.isDirectory()){
				System.out.print("目录：");
			}
			System.out.println(f.getName());
			}
			

		
		
		
		
	}
}











