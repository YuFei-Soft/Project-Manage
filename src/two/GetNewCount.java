package two;

public class GetNewCount {
		public  static int count;
		public  GetNewCount(){
			count++;  //记录次数
		}
		public static void main(String[] args) {
			GetNewCount  a=new GetNewCount();
			GetNewCount  b=new GetNewCount();
			GetNewCount  c=new GetNewCount();
			System.out.println("被创建了"+count+"次");
		}
}
