package cn.qinys.test.designpattern.builderpattern.product;

public class Mate7 extends CellPhone{
	public Mate7(){
		System.out.println("这是华为Mate7手机");
	}

	@Override
	public String toString() {
		return "Mate7具体配置： CPU" + getCpu() + ", 内存：" + getRam() + ", 屏幕大小：" + getScreen()
				+ ", 电池容量：" + getBattery() + ", 外观：" + getFacade() + ", 其他功能：" + getOthers();
	}
}
