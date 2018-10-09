package collectionFrame;

import java.util.ArrayList;

public class NewTitle {
	private int ID;
	private String name;
	private String creator;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public NewTitle(int iD, String name, String creator) {
		super();
		ID = iD;
		this.name = name;
		this.creator = creator;
	}

	public NewTitle() {
		super();
	}
	public static void main(String[] args) {
		NewTitle car=new NewTitle(1,"汽车","管理员");
		NewTitle test=new NewTitle(2,"高考","管理员");
		ArrayList newTitle=new ArrayList();
		newTitle.add(car);
		newTitle.add(test);
		System.out.println("新闻标题题目为："+newTitle.size()+"条");
		System.out.println("新闻标题的名称为：");
		for(int i=0;i<newTitle.size();i++){
			NewTitle title=(NewTitle)newTitle.get(i) ;
			System.out.println(title.getName());
		}
		
	}

}
