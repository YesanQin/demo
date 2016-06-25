package cn.qinys.test.designpattern.commanpsttern.reciver;

public class PersonReciver {
	private String name;
	public PersonReciver(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	public void action(){
		System.out.println("晚上8点钟："+this.name+"带领部下捣毁贩毒团伙。");
	}
}
