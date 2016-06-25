package cn.qinys.test.stringdemo.demo2;
/**
 * 该类用于表示一个直角坐标系上的点
 * 这里使用该类练习重写Object相关方法使用	
 * @author soft01
 *
 */
public class Point {
	private int x;
	private int y;
	public Point(){}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * 重写totring方法
	 * 当我们需要使用当前类的totring方法时，通常我们就需要重写该方法。具体
	 * 返回字符串的格式没有严格要求，可根据将来实际开发中的需求而定。但通常返
	 * 回的字符串中应当包含当前类的属性值， 以便了解当前对象的信息。
	 * 格式：（x，y）
	 */
	public String toString(){
		return "("+ x +"," + y +")";
	}
	/*
	 * 通常我们会重写一个类的equals方法
	 * equals方法的作用是比较当前对象与给定对象的内容是否一样（属性值）
	 * 若不重写则使用Object提供的，其内部就是用“==”实现的，所以并无意义。
	 * equals方法在比较两个对象内容一致时不一定要求所有属性值都一样，这要根据实际需求而定。
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj){
		if(obj==null)return false;
		if(obj==this)return true;
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}
	public static void main(String[] args){
		Point p=new Point(1,2);
		Point p1=new Point(1,2);
		/*
		 * “==”比较两个引用类型时，比较的是否为同一个对象
		 */
		System.out.println(p==p1);//false
		/*
		 * “equals”比较两个引用类型时，比较的是内容是否一样。（像不像）
		 */
		System.out.println(p.equals(p1));//true
		/*
		 * 若我们不重写Point从Object那里集成的toString方法时，使用的就是Object
		 * 提供的，它定义的该方法格式：类名@地址
		 * 通常没有什么实际意义。
		 */
		
		String str=p.toString();
		System.out.println(str);
		/*
		 * System.out.println(Object o)
		 * 该方法会将给定的对象的toString方法返回的字符串以行为单位输出到控制台
		 */
		System.out.println(p);
		
		
	}

}
