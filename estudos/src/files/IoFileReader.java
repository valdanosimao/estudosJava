package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoFileReader {

	public static void main(String[] args) {
		File file = new File("file.txt");
		try(FileReader fr = new FileReader(file)){
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
