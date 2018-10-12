package file;

import java.io.File;
import java.io.IOException;

public class GetFile {
	public static void main(String[] args) throws IOException /*throws IOException*/{
		//GetFile as = new GetFile();
		File a = new File("D:\\myClass\\test.txt");
		if(!a.exists()){
			a.createNewFile();
		}
		
	

	}


}
