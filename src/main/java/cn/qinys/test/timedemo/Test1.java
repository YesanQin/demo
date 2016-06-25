package cn.qinys.test.timedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入自己的生日，格式为：yyyy-MM-DD
 * 输入后输出到今天为止一共活了多少钱？
 * @author soft01
 *
 */
public class Test1 {
	public static void main(String[] args) throws ParseException{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入您的生日（YYYY-MM-DD）：");
		String str=scan.nextLine();
		SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=adf.parse(str);
		long l=date.getTime();
		Date date1=new Date();
		long l1=date1.getTime();
		System.out.println(l);
		long d=(l1-l)/1000/60/60/24;
		System.out.println(d+"天");
		
	}

}
