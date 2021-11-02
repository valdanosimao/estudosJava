package files;

import java.io.File;
import java.io.IOException;

public class IoFile {

	public static void main(String[] args) {

		//Objeto que cria arquivos
		File file = new File("C:\\Users\\valda\\Documents\\GitHub\\estudosJava\\valdano.txt");		
		try {
			//criando
			boolean isCreated =	file.createNewFile();
			System.out.println(isCreated);
			//System.out.println("Path" + file.getPath());//caminho
			//System.out.println("Absolute Path" + file.getAbsolutePath());//caminho absoluto
			//System.out.println("É um arquivo" + file.isFile());
			//System.out.println("Is hidden" + file.isHidden());
			//padrão para deletar arquivos, criando um boolean para saber se existe
			boolean exists = file.exists();				
			if(exists) {
				boolean isDeleted = file.delete();//Deleta
				System.out.println("Deleted " + isDeleted);
			}
			
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		
		
		
	}

}
