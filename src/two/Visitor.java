package two;

public class Visitor {
		public String name;
		public int age;
		public void showMoney(){
			if(age<=10){
				System.out.println("门票免费");
			}else if(age>=60){
				System.out.println("门票半价，门票10元");
			}else{
				System.out.println("门票20元");
			}
			
		}
}
