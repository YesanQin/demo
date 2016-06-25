本工程实验了集合工具类Collections
其中它可以用来实现集合的排序功能
方式Collections.sort();
该方法是静态方法
调用方式：
Collections.sort(List<T> list);
该方法按照默认的方式排序
也可以按照指定的方式排序，比如员工的排序，先按照年龄排序，年龄相同的按照名字排序
名字的排序是字符创之间的排序，对于字符串类中有compareTo方法，它比较的方式是：将字符串转换为字符数组，对单个字符逐一进行比较的！
Collections.sort(List<T> list,comparatorUser);
其中comparatorUser是比较器，其中定义了比较的方式
当然也可以以这种方式：
Collections.sort(List<T> list,new Comparator(){
	public int compare(Object o1, Object o2){
	
	}
);