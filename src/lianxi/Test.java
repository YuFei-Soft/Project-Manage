package lianxi;

public class Test {
	public static void main(String[] args) {
		String words="长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山 ";
		String [] printWords=new String[20];
		System.out.println("******原歌词形式******\n"+words);
		System.out.println("******拆分后的歌词形式******\n");
		printWords=words.split(" ");
		for(int i=0;i<printWords.length;i++){
			System.out.println(printWords[i]);
		}
	}

}
