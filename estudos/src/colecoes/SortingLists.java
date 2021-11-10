package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists {

	public static void main(String[] args) {
	
		List<String> animes = new ArrayList<>();
		List<Double> dinheiro = new ArrayList<Double>();
		//O ARRAYLIST É NÃO ORNENADO E ORGANIZADO POR INDEX, EX: 0,1,2 NA ORDEM QUE FOI INSERIDO
		
		animes.add("Dagron Ball Z");
		animes.add("Cavaleiros do Zodiacos");
		animes.add("Pokemon");
		animes.add("Digimon");
		animes.add("Bersek");
		
		Collections.sort(animes); //O SORT ORGANIZA A LISTA CLASSIFICA A - B
		for (String desenhos : animes) {
			System.out.println(desenhos);
		}
		
		
		dinheiro.add(1.1);
		dinheiro.add(1.4);
		dinheiro.add(1.3);
		dinheiro.add(1.2);
		System.out.println("Não organizado = " + dinheiro);
		Collections.sort(dinheiro);
		System.out.println("Organizado = " + dinheiro);
	}

}
