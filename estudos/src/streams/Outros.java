package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana" ,7.1);
		Alunos a2 = new Alunos("Luna" ,6.1);
		Alunos a3 = new Alunos("Gui" ,8.1);
		Alunos a4 = new Alunos("Gabi" ,10);
		Alunos a5 = new Alunos("Ana" ,7.1);
		Alunos a6 = new Alunos("João" ,7);
		Alunos a7 = new Alunos("Gui" ,8.1);
		Alunos a8 = new Alunos("Paulo" ,8.2);

		List<Alunos> alunos = 
				Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		//os duplicados foram excluidos
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		//pula quantidade de elementos escolhido através do skip
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)//pela dois elementos e inicia atravé do gui
		.limit(2)//limite a dois elementos
		.forEach(System.out::println);
		
		//Pegue os elementos enquanto acontecer determinada condição
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
	}
}
