package cn.qinys.test.filedemo.demo1;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 * @author soft01
 *
 */
public class FileDemo2 {
	public static void main(String[]args) throws IOException{
		/*
		 * 当前
		 */
		File file=new File("."+File.separator+"src"+File.separator+"test.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件创建成功！");
		}
		
	}

}
