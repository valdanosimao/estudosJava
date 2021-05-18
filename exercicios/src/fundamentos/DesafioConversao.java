package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o salário de Janeiro? ");
		String salarioJ = scan.next().replace(",", "."); // substitui a "," pelo "."
		
		System.out.println("Qual o salário de Fevereiro? ");
		String salarioF = scan.next().replace(",", "."); // substitui a "," pelo "."
		
		System.out.println("Qual o salário de Março? ");
		String salarioM = scan.next().replace(",", "."); // substitui a "," pelo "."
		
		double valor1 = Double.parseDouble(salarioJ);  // transforma String em double
		double valor2 = Double.parseDouble(salarioF);  // transforma String em double
		double valor3 = Double.parseDouble(salarioM);  // transforma String em double
		
		double media = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("A média dos salários é " + media);
	
		// mesmo digitando '.' ou ',' o programa vai funcionar
		
		
		scan.close();
	}

}
