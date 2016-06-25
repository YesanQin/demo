package cn.qinys.test.collection.sort;

import java.util.Comparator;

import cn.qinys.test.collection.entity.User;

public class ComparatorUser implements Comparator<User>{
//	@Override
	public int compare(User o1, User o2) {
		int flag=o1.getAge()-o2.getAge();
		if(flag==0){
			return o1.getName().compareTo(o2.getName());
		}
		return flag;
	}
}
