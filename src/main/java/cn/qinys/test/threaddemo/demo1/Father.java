package cn.qinys.test.threaddemo.demo1;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 测试子类重写父类含有throws抛出异常的方法时的注意事项
 * 
 * @author soft01
 *
 */
public class Father {
	public void dosome() throws IOException,AWTException{
		
	}
}

class Son extends Father{
	/*
	 * 重写时允许不再抛出任何异常
	 * @see day04.Father#dosome()
	 */
//	public void dosome(){
//	}
	/*
	 * 重写时也可以仅抛出父类方法抛出的部分异常
	 */
//	public void dosome()throws AWTException{
//	}
	/*
	 * 可throws父类方法中抛出异常的子类异常
	 */
//	public void dosome() throws FileNotFoundException{//此异常是IOException异常的子类异常
//	}
	/*
	 * 重写时，不允许抛出额外异常
	 * 即：父类没有的，也不是父类抛出异常是子类类型异常。
	 */
//	public void dosome() throws SQLException{//报错
//	}
	/*
	 * 重写时，不允许抛出父类抛出异常的父类异常
	 */
//	public void dosome() throws Exception{
//	}
}





