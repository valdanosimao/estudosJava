package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		
		case 1 : System.out.println("Domingo");break;
		case 2 : System.out.println("Segunda");break;
		case 3 : System.out.println("Ter�a");break;
		case 4 : System.out.println("Quarta");break;
		case 5 : System.out.println("Quinta");break;
		case 6 : System.out.println("Sexta");break;
		case 7 : System.out.println("S�bado");break;
		default : System.out.println("Dia da semana inv�lido");		
		}
		
		System.out.println("Digite o nome do seu parente");
		String nome = scan.next();
		
		switch (nome) {
		
		case "Anderson": System.out.println("Anderson � seu primo");break;
		case "Del" : System.out.println("Del � seu primo");break;
		case "Tati": System.out.println("Tati � o amor da sua vida");break;
		default: System.out.println("N�o � seu parente");
		}	
		
		
		scan.close();	
		
	}

}
