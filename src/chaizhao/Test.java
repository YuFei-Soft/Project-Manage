package chaizhao;

public class Test {
	public static void main(String[] args) {
		String a = "155sa1asa2s56qwd1";
		int count=0;
		int index=0;
		while((index=a.indexOf("sa"))!=-1){
			count++;
			a=a.substring(index+1);
			
		}
		System.out.println(count);
	}
}
