package cn.qinys.test.stringdemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.annotation.Resource;

import com.sun.org.glassfish.external.arc.Taxonomy;

public class ClazzTest {
	public static void main(String[] args) {
		Student student = new Student();
		Class clazz = student.getClass();

		Method[] methods = clazz.getMethods();
		System.out.println(methods.length);
		// for (Method method : methods) {
		// System.out.println(method + ":" +
		// method.getName()+":"+method.getReturnType());
		// }
		Method[] decalareMethods = clazz.getDeclaredMethods();// 返回public方法
		System.out.println(decalareMethods.length);
		for (Method method : decalareMethods) {
			System.out.println(method + ":" + method.getAnnotations());
		}
		String clazzName = clazz.getName();
		System.out.println("clazz:" + clazz);
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("constructor:" + constructor.getName());
		}

		Field[] fields = clazz.getDeclaredFields();
		System.out.println(fields.length);
		for (Field field : fields) {
			System.out.println("fields:" + field.getName());
		}
		Package apPackage = clazz.getPackage();
		System.out.println("package:" + apPackage);
		Annotation annotations = clazz.getAnnotation(Taxonomy.class);
		System.out.println(annotations);
//		for (Annotation annotation : annotations) {
//			System.out.println("annotation:" + annotation.toString());
//		}
	}
}
