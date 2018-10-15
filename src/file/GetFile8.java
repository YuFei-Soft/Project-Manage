package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GetFile8 {
	public static void main(String[] args) {
		User user = new User(1, "ÀîËÄ");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			FileOutputStream fo = new FileOutputStream("d:/user.txt");
			FileInputStream fi = new FileInputStream("d:/user.txt");
			oos = new ObjectOutputStream(fo);
			ois = new ObjectInputStream(fi);
			oos.writeObject(user);
			user =(User) ois.readObject();
			System.out.println(user);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
