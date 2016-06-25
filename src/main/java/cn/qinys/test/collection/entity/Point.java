package cn.qinys.test.collection.entity;
/**
 * Comparable支持泛型，而泛型的实际类型就是当前类。意思是说，哪个类实现Comparable接口，泛型就是哪个类。
 * @author soft01
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString(){
		return "("+x+","+y+")";
	}
/*
 * CompareTo方法的作用是使当前对象与给定的对象o进行比较大小。
 * 返回值不关注具体值，而是关注取值范围
 * 当返回值>0：当前对象比参数对象大
 * 当返回值<0：当前对象比参数对象小
 * 当返回值=0：两个对象相等
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
//	@Override
	public int compareTo(Point o) {
		int len=this.x*this.x+this.y*this.y;
		int l=o.x*o.x+o.y*o.y;
		return len-l;
	}
	
	

}
