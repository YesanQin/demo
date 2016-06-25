package cn.qinys.test.designpattern.commanpsttern;

import cn.qinys.test.designpattern.commanpsttern.command.AppointmentCommand;
import cn.qinys.test.designpattern.commanpsttern.command.ICommand;
import cn.qinys.test.designpattern.commanpsttern.invoker.Personinvoker;
import cn.qinys.test.designpattern.commanpsttern.reciver.PersonReciver;

public class CommandDemo {
	public static void main(String[] args) {
		Personinvoker personinvoker = new Personinvoker();
		PersonReciver personReciver = new PersonReciver("XX领导");
		ICommand iCommand = new AppointmentCommand(personReciver);
		personinvoker.setICommand(iCommand);
		personinvoker.action();
	}

}
