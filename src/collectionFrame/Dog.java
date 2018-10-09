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
		list.add(new Dog("�Ʒ�","����"));
		list.add(new Dog("ŷŷ","ѩ����"));
		list.add(new Dog("����","��������"));
		list.add(new Dog("����","��ë"));
		System.out.println("��һ����������Ϣ�ǣ�"+list.getFirst());
		System.out.println("���һ����������Ϣ�ǣ�"+list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println("ɾ�����ֹ�������"+list.size()+"����");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		
		
	}
}
