package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetFile2 {
	public static void main(String[] args) {
		File file = new File("d:/myClass/test.txt");
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.isDirectory());
		try {
			FileInputStream fi = new FileInputStream("d:/myClass/test.txt");
			try {
				int i = fi.read();
				while (i != -1) {
					System.out.print((char) i);
					i = fi.read();
				}
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
