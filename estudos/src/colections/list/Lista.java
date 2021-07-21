package colections.list;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario use = new Usuario("Ana");		

		lista.add(use);
		
		lista.add(new Usuario("Del"));
		lista.add(new Usuario("Anderson"));
		lista.add(new Usuario("Aelson"));
		lista.add(new Usuario("Jo�o"));
		lista.add(new Usuario("Geo"));
		
		System.out.println(lista.get(3).nome); //acessa pelo �ndice
		
		lista.remove(2); // remove pelo �ndice
		lista.remove(new Usuario("Del")); // remove a partir de um objeto
		
		System.out.println("Tem? " + lista.contains(new Usuario("Jo�o")));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}
	}

}
