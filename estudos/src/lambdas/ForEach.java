package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Ana" , "Boa" , "Ted" , "Boa");

		System.out.println("Forma tradicional...");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nForma 01... ");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		//se for um único parâmetro, não precisa de parênteses no (nome) ===>> aprovados.forEach(nome -> {System.out.println(n + "!!!");});	
		//se for uma única sentença de código não precisa de chaves {} ===>> aprovados.forEach(nome -> System.out.println(n + "!!!"));
		
		System.out.println("\nMethod Refence ... ");
		aprovados.forEach(System.out::println);
		
		//função personalizada 01
		System.out.println("\nMethod Refence 02... ");
		aprovados.forEach(nome -> meuImprimir(nome)); //expressão lambda passada como paranmetro
		
		//função personalizada 02
		System.out.println("\nMethod Refence 03... ");
		aprovados.forEach(ForEach::meuImprimir); // passando uma referência para uma funçao que eu criei
		
		}	
		
	
	
		
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
		
	}
	

}
