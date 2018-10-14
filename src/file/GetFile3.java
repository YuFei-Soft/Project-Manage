package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetFile3 {
	public static void main(String[] args) {
		try {
			String str = "好好学习JAVA";
			byte[] words = str.getBytes();// 字节数组
			FileOutputStream fos = new FileOutputStream("d:/myClass/test.txt");// 创建流对象，以追加方式写入文件
			try {
				fos.write(words, 0, words.length);
				System.out.println("文件已经更新");
				fos.close();
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
