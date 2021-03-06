package colections.setOrdenado;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {
	
		//O HASHSET N?O ? ORDENADO
		//Set<String> listaAprovados = new HashSet<String>();
		
		//O TREESET GARANTE A ORGEM DE INSER??O
		SortedSet<String> listaAprovados = new TreeSet<>();

		listaAprovados.add("Ricardo");
		listaAprovados.add("Ana");
		listaAprovados.add("Carla");
		listaAprovados.add("Silva");		
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}		
		
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
