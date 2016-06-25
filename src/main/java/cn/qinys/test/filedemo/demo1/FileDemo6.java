package cn.qinys.test.filedemo.demo1;

import java.io.File;

public class FileDemo6 {
	public static void main(String[] args){
		/*
		 * 删除当前目录中的a目录
		 */
		File file=new File("a");
		deleteFile(file);
	}
   public static void deleteFile(File file){
		if(file.isDirectory()){
			File[] files=file.listFiles();
			for(File f:files){
				deleteFile(f);//递归，方法里面调用本身的方法
//注意确保方法里面调方法要放在条件语句里面，否则会造成死循环！
			}
			file.delete();
		}
	}
}
