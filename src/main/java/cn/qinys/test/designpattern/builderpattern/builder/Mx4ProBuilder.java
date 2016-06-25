package cn.qinys.test.designpattern.builderpattern.builder;

import cn.qinys.test.designpattern.builderpattern.product.CellPhone;
import cn.qinys.test.designpattern.builderpattern.product.Mx4Pro;

public class Mx4ProBuilder implements CellPhoneBuilder{

	CellPhone mx4pro = new Mx4Pro();
	public void buildCpu() {
		mx4pro.setCpu("采用三星的CPU");
	}

	public void buildRam() {
		mx4pro.setRam("使用3G内存");
	}

	public void buildScreen() {
		mx4pro.setScreen("使用5.5寸2K高清显示屏");
	}

	public void buildBattery() {
		mx4pro.setBattery("使用3300毫安电池");
	}

	public void buildFacade() {
		mx4pro.setFacade("使用土豪金色航天材料");
	}

	public void buildOthers() {
		mx4pro.setOthers("使用360指纹识别技术");
	}

	public CellPhone getPhone() {
		return mx4pro;
	}

}
