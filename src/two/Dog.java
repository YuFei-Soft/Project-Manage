package two;

public class Dog {
      public  String name;
      public int health;
      public  int love;
      public String strain;
      public void show(){
    	  System.out.println("名字"+name+"健康值"+health+"亲密值"+love+"品种"+strain);
      }
      public String  getName(){
    	  return name;
      }
      public int getHealth(){
    	  return health;
      }
      public  int getLove(){
    	  return love;
      }
      public  String getStrain(){
    	  return  strain;
      }
      public static void main(String[] args) {
		System.out.println("欢迎来到宠物店");
		System.out.println("请输入");
	}
}
