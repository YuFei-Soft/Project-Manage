package two;

public class Dog {
      public  String name;
      public int health;
      public  int love;
      public String strain;
      public void show(){
    	  System.out.println("����"+name+"����ֵ"+health+"����ֵ"+love+"Ʒ��"+strain);
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
		System.out.println("��ӭ���������");
		System.out.println("������");
	}
}
