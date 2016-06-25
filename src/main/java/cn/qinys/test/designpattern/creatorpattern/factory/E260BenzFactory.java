package cn.qinys.test.designpattern.creatorpattern.factory;

import cn.qinys.test.designpattern.creatorpattern.product.BenzCar;
import cn.qinys.test.designpattern.creatorpattern.product.E260BenzCar;

public class E260BenzFactory implements BenzFactory{

	public BenzCar createCar() {
		return new E260BenzCar();
	}
}
