package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//LISTAS S�O ORDENADAS
		//AO CRIAR LISTAS, � OBRIGATORIO COLOCAR WAPPERS, LISTA N�O TRABALHA COM TIPO PRIMITIVOS
		//EX: List<Integer>,List<String>,List<Boolean> etc
		
		List<String> nomes = new ArrayList<>();//por padr�o � 16, caso for fazer uma lista grande, colocar a quantidade
		List<String> nomes2 = new ArrayList<>();//por padr�o � 16, caso for fazer uma lista grande, colocar a quantidade
		nomes.add("Valdano Sim�o");
		nomes.add("Tatiana Carla");
		
		nomes.addAll(nomes2);//adiciona todos os nomes2 na nome
		
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.add("Edna");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
	}
	
}
