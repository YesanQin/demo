package cn.qinys.test.designpattern.builderpattern.builder;

import cn.qinys.test.designpattern.builderpattern.product.CellPhone;
import cn.qinys.test.designpattern.builderpattern.product.Mate7;

public class Mate7Builder implements CellPhoneBuilder{
	CellPhone mate7 = new Mate7();

	public void buildCpu() {
		mate7.setCpu("采用华为自主研发的最新芯片");		
	}

	public void buildRam() {
		mate7.setRam("使用3G内存");
	}

	public void buildScreen() {
		mate7.setScreen("使用6寸高清显示屏");
	}

	public void buildBattery() {
		mate7.setBattery("使用4100毫安的大容量电池");
	}

	public void buildFacade() {
		mate7.setFacade("使用琥珀金的航天材料");
	}

	public void buildOthers() {
		mate7.setOthers("采用高端的后背指纹按压识别技术");
	}

	public CellPhone getPhone() {
		return mate7;
	}

}
