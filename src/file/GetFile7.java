package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GetFile7 {
	public static void main(String[] args) {
		BufferedReader fo = null;
		BufferedWriter ow = null;
		try {
			FileReader fi = new FileReader("d://pet.templater.txt");
			FileWriter fw = new FileWriter("d://seat.txt");
			fo = new BufferedReader(fi);
			ow = new BufferedWriter(fw);
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = fo.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb);
			line = sb.toString();
			line = line.replace("{name}", "ÍõÃ÷").replace("{type}", "ÍÁ¹·")
					.replace("{master}", "¶¥¶¥");
			System.out.println(line);
			ow.write(line);
			ow.flush();
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
