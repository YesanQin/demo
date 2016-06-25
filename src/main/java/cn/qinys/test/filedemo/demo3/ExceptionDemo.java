package cn.qinys.test.filedemo.demo3;
/**
 * 异常捕获机制中的try-catch
 * try中包含的是可能出错的代码片段
 * @author soft01
 *
 */
public class ExceptionDemo {
	public static void main(String[] args){
		System.out.println("程序开始了！");
		try{
			String str="a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			System.out.println("hello");
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常！");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界！");
			/*
			 * catch可以写很多个，针对不同的异常，若有不同的处理手段，可以分别捕获。
			 * 但是应当有个好的习惯，就是在最后一个捕获中来捕获Exception，这样至少可以保证程序不会因为
			 * 一个未被捕获的异常而导致中断。
			 * 当catch的异常中存在父子类集成关系时，要保证子类异常在上面，父类异常在下！
			 */
		}catch(Exception e){
			e.printStackTrace();
			System.out.println();
//			System.out.println("反正就是出了个错！");
		}
		System.out.println("程序结束了！");
		
	}
}








