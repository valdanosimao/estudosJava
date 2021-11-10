package newFilesNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path02 {

	public static void main(String[] args) throws IOException {
		
	Path pastaPath = Paths.get("C:\\Users\\valda\\Documents\\GitHub\\estudosJava\\estudos\\pasta");
	if(Files.notExists(pastaPath)) {		
		Path pastaDirectory = Files.createDirectories(pastaPath);
	}
	
	Path subPastaPath = Paths.get("C:\\Users\\valda\\Documents\\GitHub\\estudosJava\\estudos\\pasta\\subpasta");
	Path subPastaDirectory = Files.createDirectories(subPastaPath);	
	Path filePath = Paths.get(subPastaPath.toString(), "file.txt");	
	Files.createFile(filePath);
	}

}
