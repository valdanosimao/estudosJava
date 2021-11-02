package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoFileWriter {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\valda\\Documents\\GitHub\\estudosJava\\valdano.txt");
		try(FileWriter fw = new FileWriter(file);) {// try com recursos
			
			fw.write("");
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
