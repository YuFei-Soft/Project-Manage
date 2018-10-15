package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetFile4 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("d:/myClass/test.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
