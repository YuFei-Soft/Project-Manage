package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetFile3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String str = "123��456.    �ú�ѧϰJAVA";
			//byte[] words = str.getBytes();// �ֽ�����
			fos = new FileOutputStream("d:/myClass/test.txt");// ������������׷�ӷ�ʽд���ļ�
			try {
				fos.write(str.getBytes());
				System.out.println("�ļ��Ѿ�����");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("�����ļ�ʱ����");
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
