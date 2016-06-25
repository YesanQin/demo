package cn.qinys.test.designpattern.builderpattern;

import cn.qinys.test.designpattern.builderpattern.director.CellPhoneDirector;
import cn.qinys.test.designpattern.builderpattern.product.Mate7;
import cn.qinys.test.designpattern.builderpattern.product.Mx4Pro;

public class CellPhoneTest {
	public static void main(String[] args) {
		CellPhoneDirector cellPhoneDirector = new CellPhoneDirector();
		System.out.println("开始制造华为手机：");
		Mate7 mate7 = cellPhoneDirector.buildMate7();
		System.out.println(mate7);
		System.out.println("=======================");
		System.out.println("开始制造魅族手机：");
		Mx4Pro mx4Pro = cellPhoneDirector.buildMx4Pro();
		System.out.println(mx4Pro);
	}

}
