package cn.qinys.test.designpattern.creatorpattern;

import cn.qinys.test.designpattern.creatorpattern.factory.BenzFactory;
import cn.qinys.test.designpattern.creatorpattern.factory.C180BenzFactory;
import cn.qinys.test.designpattern.creatorpattern.factory.E260BenzFactory;

public class CustomerDemo {
	public static void main(String[] args) {
		System.out.println("老板，给我介绍下C180！");
		BenzFactory benzFactory1 = new C180BenzFactory();
		benzFactory1.createCar();
		System.out.println("===================");
		System.out.println("老板，给我介绍下E260！");
		BenzFactory benzFactory2 = new E260BenzFactory();
		benzFactory2.createCar();
		System.out.println("===================");
		System.out.println("两辆车试驾完毕，买了其中一辆离去！");
	}
}
