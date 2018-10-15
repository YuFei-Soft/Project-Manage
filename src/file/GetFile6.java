package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GetFile6 {
	public static void main(String[] args) {
		FileReader fi = null;
		BufferedReader fo = null;
		FileWriter fw = null;
		BufferedWriter ow = null;
		try {
			fi = new FileReader("d:/myClass/test.txt");
			fo = new BufferedReader(fi);
			fw = new FileWriter("d://test.txt");
			ow = new BufferedWriter(fw);
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = fo.readLine()) != null) {
				sb.append(line + "\r\n");
			}
			ow.write(sb.toString());
			ow.flush();
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ow.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
