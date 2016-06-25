package cn.qinys.test.designpattern.builderpattern.director;

import cn.qinys.test.designpattern.builderpattern.builder.CellPhoneBuilder;
import cn.qinys.test.designpattern.builderpattern.builder.Mate7Builder;
import cn.qinys.test.designpattern.builderpattern.builder.Mx4ProBuilder;
import cn.qinys.test.designpattern.builderpattern.product.Mate7;
import cn.qinys.test.designpattern.builderpattern.product.Mx4Pro;

public class CellPhoneDirector {
	private CellPhoneBuilder cellPhoneBuilder;
	public Mate7 buildMate7(){
		cellPhoneBuilder = new Mate7Builder();
		cellPhoneBuilder.buildCpu();
		cellPhoneBuilder.buildBattery();
		cellPhoneBuilder.buildFacade();
		cellPhoneBuilder.buildOthers();
		cellPhoneBuilder.buildRam();
		cellPhoneBuilder.buildScreen();
		return (Mate7)cellPhoneBuilder.getPhone();
	}
	public Mx4Pro buildMx4Pro(){
		cellPhoneBuilder = new Mx4ProBuilder();
		cellPhoneBuilder.buildBattery();
		cellPhoneBuilder.buildCpu();
		cellPhoneBuilder.buildFacade();
		cellPhoneBuilder.buildOthers();
		cellPhoneBuilder.buildRam();
		cellPhoneBuilder.buildScreen();
		return (Mx4Pro)cellPhoneBuilder.getPhone();
	}
}
