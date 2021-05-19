package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero ");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operador arim�tico? ");
		String op = scan.next();		
		
		//L�gica
		int resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%d %s %d = %d  ",num1,op,num2,resultado);
		
		
		scan.close();
		

	}

}
