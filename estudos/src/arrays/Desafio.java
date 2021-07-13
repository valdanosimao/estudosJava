package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Quantas notas? ");
		int qtdNotas = scan.nextInt();		
		
		double [] notas = new double [qtdNotas];// criei um array com a qtd de notas digitadas pelo usuário
		
		System.out.println("Digite a primeira nota do Aluno");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do Aluno");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota do Aluno");
		//double n3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota do Aluno");
		double n4 = scan.nextDouble();
		
		System.out.println("A quantidade de Arrays é " + notas.length);
		
		double media = (n1 + n2 + n2 + n4) / 4;
		
		System.out.println("Média do aluno é " + media);
		
		
		
		
		scan.close();
	}

}
