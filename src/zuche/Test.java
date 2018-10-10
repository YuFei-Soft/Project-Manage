package zuche;

public class Test {
	public static void main(String[] args) {
		//创建业务类
		MotoBiz motoBiz=new MotoBiz();
		motoBiz.init();
		motoBiz.calcRent(10);
	}

}
