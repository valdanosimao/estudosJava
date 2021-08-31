package fluxoDados;

import java.io.File;

public class FileAula {
	
	public static void main(String[] args) {
		
		File arquivo = new File("C:\\java\\arquivoAulaFile.txt");		
		System.out.println("Nome do arquivo " + arquivo.getName());
		System.out.println("Caminho do arquivo " + arquivo.getAbsolutePath());
		System.out.println("O arquivo existe? " + arquivo.exists());
		System.out.println("� um diret�rio? " + arquivo.isDirectory());
		System.out.println("� um arquivo? " + arquivo.isFile());
		System.out.println("Pode ser lido? " + arquivo.canRead());
		System.out.println("Pode escrever? " + arquivo.canWrite());		
		
		
	}

}
