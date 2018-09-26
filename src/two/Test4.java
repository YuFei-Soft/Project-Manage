package two;

public class Test4 {

	public static void main(String[] args) {
		Bird bird = null;
		XiaoN xiaon = null;
		bird=new Bird();
		xiaon=new XiaoN();
		Boolean res;
		res=xiaon instanceof Bird;
		System.out.println("xiaon instanceof Bird****"+res);
		bird=new XiaoN();
		res=bird instanceof Bird;
		System.out.println(res);
		
	}
}
