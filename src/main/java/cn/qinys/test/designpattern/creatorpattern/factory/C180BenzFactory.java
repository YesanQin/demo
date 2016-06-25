package cn.qinys.test.designpattern.creatorpattern.factory;

import cn.qinys.test.designpattern.creatorpattern.product.BenzCar;
import cn.qinys.test.designpattern.creatorpattern.product.C180BenzCar;

public class C180BenzFactory implements BenzFactory{

	public BenzCar createCar() {
		return new C180BenzCar();
	}
}
