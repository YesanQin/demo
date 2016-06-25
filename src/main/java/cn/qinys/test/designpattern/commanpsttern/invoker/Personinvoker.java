package cn.qinys.test.designpattern.commanpsttern.invoker;

import cn.qinys.test.designpattern.commanpsttern.command.ICommand;

public class Personinvoker {
	private ICommand iCommand;
	public void setICommand(ICommand iCommand){
		this.iCommand =iCommand;
	}
	public void action(){
		this.iCommand.execute();
	}
}
