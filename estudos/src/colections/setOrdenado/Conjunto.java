package colections.setOrdenado;

import java.util.Set;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {
	
		//Set<String> listaAprovados = new HashSet<String>();
		Set<String> listaAprovados = new TreeSet<String>();

		listaAprovados.add("Ricardo");
		listaAprovados.add("Ana");
		listaAprovados.add("Carla");
		listaAprovados.add("Silva");		
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		//ele não aceita valor int, tem que ser o Integer, ou seja uma Classe do tipo primitivo!!!
		Set<Integer> nums = new TreeSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		for(int n : nums) {
			System.out.println(n);
		}
	}

}
