package cn.qinys.test.stringdemo.demo2;
/**
 * 和谐用语
 * @author soft01
 *
 */

public class StringDemo5 {
	public static void main(String[] args){
		String regex="(wqnmgb|tmd|djb|dsb)";
		String message
		="wqnmgb!你怎么这么dsb！你个djb！";
		message=message.replaceAll(regex, "***");
		System.out.println(message);
	}

}
