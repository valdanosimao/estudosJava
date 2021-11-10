package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//LISTAS SÃO ORDENADAS
		//AO CRIAR LISTAS, É OBRIGATORIO COLOCAR WAPPERS, LISTA NÃO TRABALHA COM TIPO PRIMITIVOS
		//EX: List<Integer>,List<String>,List<Boolean> etc
		
		List<String> nomes = new ArrayList<>();//por padrão é 16, caso for fazer uma lista grande, colocar a quantidade
		List<String> nomes2 = new ArrayList<>();//por padrão é 16, caso for fazer uma lista grande, colocar a quantidade
		nomes.add("Valdano Simão");
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
