package two;

public class GetNewCount {
		public  static int count;
		public  GetNewCount(){
			count++;  //��¼����
		}
		public static void main(String[] args) {
			GetNewCount  a=new GetNewCount();
			GetNewCount  b=new GetNewCount();
			GetNewCount  c=new GetNewCount();
			System.out.println("��������"+count+"��");
		}
}
