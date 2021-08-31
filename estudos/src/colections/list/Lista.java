package colections.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//UMA LISTA DE USUÁRIO
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Del"));
		lista.add(new Usuario("Anderson"));
		lista.add(new Usuario("Aelson"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Geo"));
		
		System.out.println(lista.get(3)); //acessa pelo índice
		
		lista.remove(2); // remove pelo índice
		lista.remove(new Usuario("Del")); // remove a partir de um objeto
		
		System.out.println("Tem? " + lista.contains(new Usuario("João")));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
	}

}
