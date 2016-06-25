package cn.qinys.test.filedemo.demo3;

import java.io.Serializable;
import java.util.List;
/**
 * 若当前类的对象希望被ObjectOutputStream进行序列化，当前类必须实现
 * java.io.Serializable接口。否则在序列化过程中会抛出异常。
 * 该接口没有任何抽象方法需要重写，这种结果的目的是给子类打上一个标签，
 * 表示其认可这件事。而不是用来约束子类应具有哪些行为。
 * 
 * 除了当前类之外，该类的属性若也是自定义类型的，那么该类也必须实现Serializable接口才可以。
 * @author soft01
 *
 */

public class Person implements Serializable{
	/**
	 * 当我们的类实现了Serializable接口后，就应当定义下面的常量，该常量是版本号。最好自行维护。
	 * 该版本号直接影响反序列化的结果。
	 * 当我们要反序列化一个对象时，OIS首先会检查要反序列化的那一组字节表示的对象的版本号是否与当前类
	 * 的版本号一致，不一致则直接抛出异常，告知版本不匹配，无法反序列化。
	 * 若版本号一致，则会使用兼容模式，即：
	 * 原来对象中有的属性，现在类还有的，则还原他的值
	 * 若原来对象中有的属性，现在没有了，则忽略。
	 * 若原来对象中没有的属性，现在有的，则只有默认值。
	 * 
	 * 若不自行维护版本号，那么OOS在进行序列化时，会根据当前类的结构生成一个版本号，这样做不好的地方在于，
	 * 我们的类结构发生改变后，版本号也会改变，由于不可控，所以不能启用兼容模式。
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private transient List<String>otherInfo;
	public Person(String name, int age, String gender, int salary,
			List<String> otherInfo) {
		this.name = name;
		this.age = age; 
		this.gender = gender;
		this.salary = salary;
		this.otherInfo = otherInfo;
	}
	public Person(){
		
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	};
	public String toString(){
		return name+","+age+","+gender+","+salary+","+otherInfo;
	}

}
