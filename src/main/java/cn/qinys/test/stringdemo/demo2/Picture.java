package cn.qinys.test.stringdemo.demo2;
/**
 * 图片重命名
 * @author soft01
 *
 */

public class Picture {
	public static void main(String[] args){
		String imName="123.jpg";
		String[] data=imName.split("\\.");
		//打桩
		System.out.println(data.length);
		imName=System.currentTimeMillis()+"."+data[1];
		System.out.println(imName);//服务器接收图片，防止重名，利用系统时间做重新命名
	}

}
