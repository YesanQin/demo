package cn.qinys.test.stringdemo.demo2;
import java.util.Arrays;
/**
 * String split(String regex)
 * 将当前字符串中满足正则表达式的部分“切掉”，保留剩下的部分。拆分字符串操作。
 * @author soft01
 *
 */
public class split {
	public static void main(String[] srgs){
		String str="sdf4f5sa4f4s6af4453sd4fs4d4fsa54f";
		String[] array=str.split("[0-9]+");
		System.out.println(Arrays.toString(array));
	}
}
