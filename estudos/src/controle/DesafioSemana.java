package controle;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero que representa um dia da semana: ");
		int dia = scan.nextInt();
		
		if (dia == 1) {
			System.out.println("Domingo\n");
		}else if (dia == 2) {
			System.out.println("Segunda\n");
		}else if (dia == 3) {
			System.out.println("Ter�a\n");
		}else if (dia == 4) {
			System.out.println("Quarta\n");
		}else if (dia == 5) {
			System.out.println("Quinta\n");
		}else if (dia == 6) {
			System.out.println("Sexta\n");
		}else if (dia == 7) {
			System.out.println("S�bado\n");
		}else {
			System.out.println("Dia da semana inv�lido\n");
		}		
		
		System.out.println("Fim...");
		
		
		scan.close();
	}

}
