package cn.qinys.test.designpattern.commanpsttern.command;

import cn.qinys.test.designpattern.commanpsttern.reciver.PersonReciver;

public class AppointmentCommand implements ICommand {
	private PersonReciver personReciver;

	public AppointmentCommand(PersonReciver personReciver) {
		this.personReciver = personReciver;
	}

	public void execute() {
		System.out.println("今晚8点，某防毒团伙在某地进行交易。");
	}
	public void action(){
		personReciver.action();
	}
}
