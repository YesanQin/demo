package cn.qinys.test.lombokdemo.entity;

import lombok.Data;
/**
 *@Data标签可以让编译工具在编译的时候自动为实体类添加setter和getter方法以及toString等方法
 */
@Data
public class Student
{
	private String name;
	
	private String age;
}

