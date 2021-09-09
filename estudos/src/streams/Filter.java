package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana" ,  7.9);
		Alunos a2 = new Alunos("Bia" ,  5.8);
		Alunos a3 = new Alunos("Daniel" ,  9.8);
		Alunos a4 = new Alunos("Gui" ,  6.8);
		Alunos a5 = new Alunos("Rebeca" ,  7.1);
		Alunos a6 = new Alunos("Pedro" ,  8.8);

		
		List<Alunos> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabéns! " + a.nome + " Você foi aprovado! ")
		.forEach(System.out::println);
		
		
	}

}
