package cn.qinys.test.systemjava;

public class SystemJavaTest
{
	public static void main(String[] args)
	{
		System.out.println("Java 运行时环境版本 java.version:\t"+System.getProperty("java.version"));
		System.out.println("Java 运行时环境供应商 java.vendor:\t"+System.getProperty("java.vendor"));
		System.out.println("Java 供应商的 URL java.vendor.url:\t"+System.getProperty("java.vendor.url"));
		System.out.println("Java 安装目录 java.home:\t"+System.getProperty("java.home"));
		System.out.println("Java 虚拟机规范版本 java.vm.specification.version:\t"+System.getProperty("java.vm.specification.version"));
		System.out.println("Java 虚拟机规范供应商 java.vm.specification.vendor:\t"+System.getProperty("java.vm.specification.vendor"));
		System.out.println("Java 虚拟机规范名称 java.vm.specification.name:\t"+System.getProperty("java.vm.specification.name"));
		System.out.println("Java 虚拟机实现版本 java.vm.version:\t"+System.getProperty("java.vm.version"));
		System.out.println("Java 虚拟机实现供应商 java.vm.vendor:\t"+System.getProperty("java.vm.vendor"));
		System.out.println("Java 虚拟机实现名称 java.vm.name:\t"+System.getProperty("java.vm.name"));
		System.out.println("Java 运行时环境规范版本 java.specification.version:\t"+System.getProperty("java.specification.version"));
		System.out.println("Java 运行时环境规范供应商 java.specification.vendor:\t"+System.getProperty("java.specification.vendor"));
		System.out.println("Java 运行时环境规范名称 java.specification.name:\t"+System.getProperty("java.specification.name"));
		System.out.println("Java 类格式版本号 java.class.version:\t"+System.getProperty("java.class.version"));
		System.out.println("Java 类路径 java.class.path:\t"+System.getProperty("java.class.path"));
		System.out.println("加载库时搜索的路径列表 java.library.path:\t"+System.getProperty("java.library.path"));
		System.out.println("默认的临时文件路径 java.io.tmpdir:\t"+System.getProperty("java.io.tmpdir"));
		System.out.println("要使用的 JIT 编译器的名称 java.compiler:\t"+System.getProperty("java.compiler"));
		System.out.println("一个或多个扩展目录的路径 java.ext.dirs:\t"+System.getProperty("java.ext.dirs"));
		System.out.println("操作系统的名称 os.name:\t"+System.getProperty("os.name"));
		System.out.println("操作系统的架构 os.arch:\t"+System.getProperty("os.arch"));
		System.out.println("操作系统的版本 os.version:\t"+System.getProperty("os.version"));
		System.out.println("文件分隔符（在 UNIX 系统中是“/”） file.separator:\t"+System.getProperty("file.separator"));
		System.out.println("路径分隔符（在 UNIX 系统中是“:”） path.separator:\t"+System.getProperty("path.separator"));
		System.out.println("行分隔符（在 UNIX 系统中是“/n”） line.separator:\t"+System.getProperty("line.separator"));
		System.out.println("用户的账户名称 user.name:\t"+System.getProperty("user.name"));
		System.out.println("用户的主目录 user.home:\t"+System.getProperty("user.home"));
		System.out.println("用户的当前工作目录 user.dir:\t"+System.getProperty("user.dir"));
	}
}
