package two;

public class CeShi {
	public static void main(String[] args) {
		TestPeople as = new TestPeople();
		int num = 6;
		as.get(num);
		People ad=new People();
		ad.age=16;//这里就是引用数据类型
		as.put(ad);
		System.out.println(num+"***"+ad.age);
		//当参数传递为基本数据类型时，参数变化不保留       基本数据类型参数传递的是值
		//当参数传递为引用数据类型时，参数变化会保留       引用数据类型参数传递的是地址
		//******总结******
		       //基本数据类型，操作传递的是变量的值，改变一个变量的值不会影响列一个变量的值。 
		       //引用数据类型（类， 数组，接口），赋值是把原 对象的引用（可理解为内存的地址）传递给列一个的引用
	}
}
