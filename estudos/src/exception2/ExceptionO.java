package exception2;

import java.io.File;
import java.io.IOException;

public class ExceptionO {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\valda\\Documents\\GitHub\\estudosJava\\estudos\\test.txt");
		
		try { //tente
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
			
		}catch(IOException e){ //pegue
			e.printStackTrace(); //imprime tudo que aconteceu na stack //l�gica de n�gocio n�o deve usar dentro do catch
		}
		
	}	
	
}
