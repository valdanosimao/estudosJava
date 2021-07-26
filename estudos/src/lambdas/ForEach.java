package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Ana" , "Boa" , "Ted" , "Boa");

		System.out.println("Forma tradicional...");
		for(String n : aprovados) {
			System.out.println(n);
		}
		
		System.out.println("\nForma 01... ");
		aprovados.forEach((n) -> {System.out.println(n + "!!!");});
		//se for um �nico par�metro, n�o precisa de par�nteses no (n) ===>> aprovados.forEach(n -> {System.out.println(n + "!!!");});	
		//se for uma �nica senten�a de c�digo n�o precisa de chaves {} ===>> aprovados.forEach(n -> System.out.println(n + "!!!"));
		
		System.out.println("\nMethod Refence ... ");
		aprovados.forEach(System.out::println);
		
		//fun��o personalizada 01
		System.out.println("\nMethod Refence 02... ");
		aprovados.forEach(nome -> meuImprimir(nome)); //express�o lambda passada como paranmetro
		
		//fun��o personalizada 02
		System.out.println("\nMethod Refence 03... ");
		aprovados.forEach(ForEach::meuImprimir); // passando uma refer�ncia para uma fun�ao que eu criei
		
		}	
		
	
	
		
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome � " + nome);
		
	}
	

}
