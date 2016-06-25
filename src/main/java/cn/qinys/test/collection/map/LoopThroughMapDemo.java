package cn.qinys.test.collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cn.qinys.test.collection.entity.User;

public class LoopThroughMapDemo {
	public static void main(String[] args) {
		Map<String, User> map = new HashMap<String, User>();
		map.put("tom", new User("tom", 21));
		map.put("may", new User("may", 31));
		map.put("jsc", new User("jsc", 23));
		System.out.println("---根据key值遍历---");
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(map.get(s).getAge() + "," + map.get(s).getName());
		}
		System.out.println(" ---根据键值对遍历---");
		Set<Entry<String, User>> entry = map.entrySet();
		for (Entry<String, User> e : entry) {
			System.out.println(e.getKey());
			System.out.println(e.getValue().getAge() + "," + e.getValue().getName());
		}
		System.out.println("---根据values遍历---");
		Collection<User> c = map.values();
		for (User u : c) {
			System.out.println(u.getAge() + "," + u.getName());
		}
		System.out.println("---迭代器遍历---");

		System.out.println();
		List<User> users = new ArrayList<User>();
		users.add(new User("tom", 21));
		users.add(new User("may", 31));
		users.add(new User("jsc", 23));
		for (User user : users) {
			System.out.println(user.getAge() + "," + user.getName());
		}
	}

}
