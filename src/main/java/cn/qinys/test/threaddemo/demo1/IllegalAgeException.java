package cn.qinys.test.threaddemo.demo1;
/**
 * 自定义异常，通常用来描述某个业务逻辑级别的错误
 * 年龄不合法
 * @author soft01
 *
 */
public class IllegalAgeException extends Exception{
	

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalAgeException(String message) {
		super(message);
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
	}
}
