package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetFile3 {
	public static void main(String[] args) {
		try {
			String str = "123��456.    �ú�ѧϰJAVA";
			byte[] words = str.getBytes();// �ֽ�����
			FileOutputStream fos = new FileOutputStream("d:/myClass/test.txt");// ������������׷�ӷ�ʽд���ļ�
			try {
				fos.write(words, 0, words.length);
				System.out.println("�ļ��Ѿ�����");
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("�����ļ�ʱ����");
		}
	}

}
