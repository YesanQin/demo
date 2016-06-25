package cn.qinys.test.designpattern.builderpattern.product;

public class Mx4Pro extends CellPhone{
	public Mx4Pro(){
		System.out.println("这是魅族Mx4Pro手机");
	}
	
	@Override
	public String toString() {
		return "Mx4Pro具体配置：CPU" + getCpu() + ", 内存：" + getRam() + ", 屏幕大小：" + getScreen()
				+ ", 电池容量：" + getBattery() + ", 外观：" + getFacade() + ", 其他功能：" + getOthers();
	}
}
