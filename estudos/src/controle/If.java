package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a m�dia ");
		double media = scan.nextDouble();
		
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado, Parab�s!! ");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		if (media < 4.5) {
			System.out.println("Reprovado");
		}
		
		
		
		scan.close();
	}

}
