package cn.qinys.test.filedemo.demo1;

public class Addddd {
	static int i=0;
	public static void main(String[] args){
		System.out.println(add(100));
	}
	public static int add(int a){//递归算法
		int sum=0;
		if(a>0){
			sum=a+add(--a);
			i++;
		}
		System.out.println(i);
		return sum;
	}

}
