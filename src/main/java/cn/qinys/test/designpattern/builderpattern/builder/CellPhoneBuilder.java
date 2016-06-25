package cn.qinys.test.designpattern.builderpattern.builder;

import cn.qinys.test.designpattern.builderpattern.product.CellPhone;

public interface CellPhoneBuilder {
	public void buildCpu();
	public void buildRam();
	public void buildScreen();
	public void buildBattery();
	public void buildFacade();
	public void buildOthers();
	public CellPhone getPhone();
}
