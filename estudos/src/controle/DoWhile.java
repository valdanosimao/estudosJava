package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String text = "";
		
		do {
			System.out.println("Voce precosa falar " + "as palavras mágicas..");
			System.out.println("Quer sair? ");
			text = scan.next();
		}while(!text.equalsIgnoreCase("Sim"));
		
		
		
		System.out.println("Obrigado");
		
		
		
		
		
		
		scan.close();
	}

}
