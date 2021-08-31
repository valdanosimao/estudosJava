package colections.setOrdenado;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {
	
		//O HASHSET NÃO É ORDENADO
		//Set<String> listaAprovados = new HashSet<String>();
		
		//O TREESET GARANTE A ORGEM DE INSERÇÃO
		Set<String> listaAprovados = new TreeSet<>();

		listaAprovados.add("Ricardo");
		listaAprovados.add("Ana");
		listaAprovados.add("Carla");
		listaAprovados.add("Silva");		
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		//ele não aceita valor int, tem que ser o Integer, ou seja uma Classe do tipo primitivo!!!
		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);		

		for(int n : nums) {
			System.out.println(n);
		}
	}

}
