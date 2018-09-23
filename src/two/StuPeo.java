package two;

public class StuPeo {
	String[] names = new String[10];

	// 增加学生，参数是name，需要添加学生姓名
	public void putName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}

	}

	// 在一定的区间内查周末个学生
	// 要知道从哪里开始查找，需要查找那个人。start 是开始查找的位置 end是结束查找的位置 name是查找的学生姓名
	public boolean getName(int start, int end, String name) {
		boolean flag = false; // 标记是否查找到该学生，false是没找到，true是找到了。
		for (int i = start - 1; i < end; i++) {
			if (names[i].equals(name)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// 打印学生姓名的列表
	public void shoeName() {
		System.out.println("***学生列表***");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i] + "\t");
			}
		}
	}
}
