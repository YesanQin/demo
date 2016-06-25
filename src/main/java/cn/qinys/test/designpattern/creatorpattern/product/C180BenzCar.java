package cn.qinys.test.designpattern.creatorpattern.product;

public class C180BenzCar implements BenzCar{

	public C180BenzCar(){
		this.carColor();
		this.carSpeed();
		this.carPrice();
	}
	public void carColor() {
		System.out.println("这辆C180车子是白色的，显得很时尚！");
	}

	public void carSpeed() {
		System.out.println("这辆C180车子车子最高时速可达到160公里每小时");
	}

	public void carPrice() {
		System.out.println("这辆C180车子车子目前售价为34万元");
	}
}
