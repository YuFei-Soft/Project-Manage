package two;

public class Visitor {
		public String name;
		public int age;
		public void showMoney(){
			if(age<=10){
				System.out.println("��Ʊ���");
			}else if(age>=60){
				System.out.println("��Ʊ��ۣ���Ʊ10Ԫ");
			}else{
				System.out.println("��Ʊ20Ԫ");
			}
			
		}
}
