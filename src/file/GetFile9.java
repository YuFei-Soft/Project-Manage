package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetFile9 {
	public static void main(String[] args) {
		DataInputStream fi = null;
		DataOutputStream fo = null;
		FileInputStream fw = null;
		FileOutputStream fs = null;
		try {
			fw = new FileInputStream("d://timg.jpg");
			fs = new FileOutputStream("e://timg2.jpg");
			fi = new DataInputStream(fw);
			fo = new DataOutputStream(fs);
			byte[] words = new byte[1024];
			int length = 0;
			while ((length = fw.read(words)) != -1) {
				fo.write(words, 0, length);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
