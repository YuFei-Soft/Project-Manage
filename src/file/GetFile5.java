package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetFile5 {
	public static void main(String[] args) {
		FileInputStream file = null;
		FileOutputStream fi = null;
		try {
			file = new FileInputStream("d:/myClass/test.txt");
			fi = new FileOutputStream("d:/my/test.txt");
			byte[] words = new byte[10];
			// int length;
			int length = file.read(words);
			while (length != -1) {
				fi.write(words, 0, length);
				length = file.read(words);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
