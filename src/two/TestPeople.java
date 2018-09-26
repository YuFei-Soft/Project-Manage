package two;

public class TestPeople {
	//参数int， 是基本数据类型
	public void get(int num) {
		num = num + 1;
	}
	//参数为自定义类型  数组，接口，引用数据类型的
	public void put(People student){
		student.age=student.age+1;
		
	}

}
