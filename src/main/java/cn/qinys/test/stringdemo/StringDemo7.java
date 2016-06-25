package cn.qinys.test.stringdemo;
/**
 * char charAt(int index)
 * 获取当前字符串中指定位置对应的字符
 * @author soft01
 *
 */
public class StringDemo7 {
  public static void main(String[] args){
	  //               012 345 67 890 1234 5
	  String str="thinking in java";
	 char c= str.charAt(9);
	  System.out.println(c);
  }
}
