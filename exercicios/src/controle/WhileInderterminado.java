package controle;

import java.util.Scanner;

public class WhileInderterminado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voc� diz: ");
			valor = scan.nextLine();
		}

	}

}
