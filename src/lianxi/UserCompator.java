package lianxi;

import java.util.Comparator;

public class UserCompator implements Comparator<User> {

	@Override
	public int compare(User arg0, User arg1) {
		return arg0.getID() - arg1.getID();
	}

}
