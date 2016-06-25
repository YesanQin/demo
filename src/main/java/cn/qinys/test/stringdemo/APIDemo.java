package cn.qinys.test.stringdemo;
/**
 * 文档注释可以在：类，常量，方法上声明。
 * 分别用于说明它们的功能和作用。
 * 文档注释会被javadoc命令在读取当前源程序的时候
 * 解析并使其生成说明文档。
 * @author soft01
 * @version 1.0,20/08/15
 * @see java.lang.String
 * @since JDK1.0
 *
 */
public class APIDemo {
	/**
	 * 添加问候语方法sayHello中的问候语内容
	 */
	public static final String HELLO_STR="你好！";
	/**
	 * 该方法的作用是返回一个添加了对给定用户的问候
	 * 语的字符串
	 * @param name 需要添加问候语的用户名
	 * @return 带问候语的字符串
	 */
	public static String sayHello(String name){
		return HELLO_STR+name;
	}

}
