package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",1,2,3,4,5,6);
		
		System.out.printf("Salário %.2f%n",1234.4578);
		System.out.printf("Nome: %s","João\n");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.next();		
		
		System.out.println("Digite o seu Sobre-nome: ");
		String sobreNome = entrada.next();		
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome é: %s e seu sobre nome é: %s e a sua idade = %d ",nome , sobreNome , idade);
		
		entrada.close();
		
		
		}
	}


