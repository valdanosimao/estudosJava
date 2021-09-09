package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana" ,7.1);
		Alunos a2 = new Alunos("Luna" ,6.1);
		Alunos a3 = new Alunos("Gui" ,8.1);
		Alunos a4 = new Alunos("Gabi" ,10);

		List<Alunos> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Alunos> aprovado = a -> a.nota >= 7;
		Function<Alunos, Double> nota = a -> a.nota;
		BinaryOperator<Double> somatoria = (a, b) -> a + b;
		
		alunos.stream()
		.filter(aprovado)
		.map(nota)
		.reduce(somatoria)
		.ifPresent(System.out::println);
		
	}

}
