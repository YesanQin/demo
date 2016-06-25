package cn.qinys.test.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cn.qinys.test.collection.entity.User;

public class CollectionSortDemo {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("tom", 21));
		users.add(new User("mar", 62));
		users.add(new User("jack", 12));
		users.add(new User("aom", 22));
		users.add(new User("com", 42));
		users.add(new User("som", 34));
		users.add(new User("fom", 36));
		users.add(new User("fom", 42));
		users.add(new User("gom", 65));
		users.add(new User("hom", 76));
		users.add(new User("jom", 29));
		users.add(new User("mamq", 22));
		users.add(new User("mam", 32));
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getAge() + "," + users.get(i).getName());
		}
		System.out.println();
		// ComparatorUser comparator=new ComparatorUser();
		Collections.sort(users, new Comparator<User>() {
			// @Override
			public int compare(User o1, User o2) {
				int flag = o1.getAge() - o2.getAge();
				if (flag == 0) {
					return o1.getName().compareTo(o2.getName());
				}
				return flag;
			}
		});
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getAge() + "," + users.get(i).getName());
		}
		System.out.println(users);
		System.out.println(users.get(1));
		System.out.println(users.get(1).getClass().getName() + "@" + Integer.toHexString(users.get(1).hashCode()));
		System.out.println(users.get(0).hashCode());
		System.out.println(Integer.parseInt("1d6f122", 16));
		System.out.println(users.hashCode());
		System.out.println(users.getClass());
		System.out.println(users.getClass().getName());
		System.out.println(users.getClass().getClass().getName());
	}
}
