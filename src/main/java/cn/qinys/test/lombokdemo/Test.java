package cn.qinys.test.lombokdemo;

import cn.qinys.test.lombokdemo.entity.Student;

public class Test
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setName("qinys");
		student.setAge("99");
		System.out.println(student);
	}
}
