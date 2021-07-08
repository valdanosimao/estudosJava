package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a média ");
		double media = scan.nextDouble();
		
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado, Parabés!! ");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if (media < 4.5) {
			System.out.println("Reprovado");
		}
		
		
		
		scan.close();
	}

}
