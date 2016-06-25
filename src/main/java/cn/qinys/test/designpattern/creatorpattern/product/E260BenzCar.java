package cn.qinys.test.designpattern.creatorpattern.product;

public class E260BenzCar implements BenzCar{

	public E260BenzCar(){
		this.carColor();
		this.carSpeed();
		this.carPrice();
	}
	public void carColor() {
		System.out.println("这辆E260车子是黑色的，显得很沉稳！");
	}

	public void carSpeed() {
		System.out.println("这辆E260车子车子最高时速可达到180公里每小时");
	}

	public void carPrice() {
		System.out.println("这辆E260车子车子目前售价为16万元");
	}

}
