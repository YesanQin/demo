package cn.qinys.test.stringdemo;
/**
 * 检查一个字符串是否为回文
 * @author soft01
 *
 */
public class StringDemo8 {
	public static void main(String[] srgs){
		String str="上海自来水来自海上";
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.println("不是回文");
				return;//停止执行体的执行
				//一旦检测到第一个字符已经不符合回文规则，就停止执行了整个方法！
				//满足回文规则就执行所有的循环，并完整执行整个程序
				//不满足不用执行完整个程序
			}
		}
		System.out.println("是回文");
		
	}

}
