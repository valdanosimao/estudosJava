package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoBufferedWriter {

	public static void main(String[] args) {
		File file = new File("file.txt");
		try(FileWriter fw = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fw)){
			fw.write("Teste");
			br.newLine();
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
