package cn.qinys.test.timedemo;
/**
 * 
 * @author soft01
 *VO value Object 值对象
 *值的取值范围（业务逻辑需要eg：人的年龄 和 计算识别之分）
 *getset方法可以控制属性值的安全性，
 *通过对象来访问属性，而不是直接访问对象的某些属性，此时使用getset方法
 */
public class EmpTest {
	String name;
	int age;
	String gender;
	double salary;
	public EmpTest(String name, int age, String gender, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
//	
//	public EmpTest(String name,int age,String gender,double salary){
//		this.name=name;
//		this.age=age;
//		this.gender=gender;
//		this.salary=salary;
//	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if( obj instanceof EmpTest){
			EmpTest p=(EmpTest)obj;
			
			return p.name.equals(this.name);
		}else return false;
	}
	public String toString(){
		return name+","+age+","+gender+","+salary+"。";
	}
	public static void main(String[] srgs){
		EmpTest emp=new EmpTest("张三",23,"男",5000);
		System.out.println(emp);
	}
}
