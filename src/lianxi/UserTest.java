package lianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserTest {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(2, "aaaa2"));
		list.add(new User(4, "aaaa4"));
		list.add(new User(3, "aaaa3"));
		list.add(new User(1, "aaaa1"));
		Collections.sort(list);
		
		Collections.sort(list,  new UserCompator());
		for (User user : list) {
			System.out.println(user);
		}

	}


}
