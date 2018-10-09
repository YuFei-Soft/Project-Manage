package collectionFrame;

import java.util.LinkedList;

public class Dog {
	private String name;
	private String variety;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public Dog(String name, String variety) {
		super();
		this.name = name;
		this.variety = variety;
	}

	public Dog() {
		super();
	}

	@Override
	public String toString() {
		return name + "\t" + variety;
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(new Dog("菲菲","土狗"));
		list.add(new Dog("欧欧","雪纳瑞"));
		list.add(new Dog("亚亚","拉布拉多"));
		list.add(new Dog("美美","金毛"));
		System.out.println("第一条狗狗的信息是："+list.getFirst());
		System.out.println("最后一条狗狗的信息是："+list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println("删除部分狗狗后还有"+list.size()+"狗狗");
		System.out.println("分别是：");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		
		
	}
}
