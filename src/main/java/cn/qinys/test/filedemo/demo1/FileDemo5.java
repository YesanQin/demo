	package cn.qinys.test.filedemo.demo1;

	import java.io.File;

	/**
	 * 创建一个多级目录
	 * @author Administrator
	 *
	 */
	public class FileDemo5 {
		public static void main(String[] args) {
			/*
			 * 在当前项目根目录下创建目录:
			 * a/b/c/d/e/f
			 */
			File dir = new File(
				"."+File.separator+
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+
				"f"
			);
			if(!dir.exists()){
				/*
				 * mkdirs()方法在创建当前目录的同时会将所有
				 * 不存在的父目录一同创建出来。
				 */
				dir.mkdirs();
				System.out.println("创建完毕!");
			}
		}
	}




	

