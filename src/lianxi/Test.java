package lianxi;

public class Test {
	public static void main(String[] args) {
		String words="��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ ";
		String [] printWords=new String[20];
		System.out.println("******ԭ�����ʽ******\n"+words);
		System.out.println("******��ֺ�ĸ����ʽ******\n");
		printWords=words.split(" ");
		for(int i=0;i<printWords.length;i++){
			System.out.println(printWords[i]);
		}
	}

}
