package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana", 7.1);
		Alunos a2 = new Alunos("Luna", 6.1);
		Alunos a3 = new Alunos("Gui", 8.1);
		Alunos a4 = new Alunos("Gabi", 10);
		
		List<Alunos> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Alunos> aprovados = a -> a.nota >= 7;
		Predicate<Alunos> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));//todos aprovados?
		System.out.println(alunos.stream().anyMatch(aprovados)); //pelo menos um aprovado?
		System.out.println(alunos.stream().noneMatch(aprovados)); //nenhum aprovado
		System.out.println(alunos.stream().noneMatch(reprovados)); //nenhum reprovado
		
		
		
		
		
		
		
	}

}
