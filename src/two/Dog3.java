package two;

public class Dog3 {//����ѭ���Ĵ���!!!!
	static int sum;

	public Dog3() {
		sum++;
	}

	public static void main(String[] args) {
		Dog3 a = new Dog3();
		Dog3 b = new Dog3();
		Dog3 c = new Dog3();
		System.out.println(a.sum);
	}

}
