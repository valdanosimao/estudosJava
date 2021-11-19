package colections.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//UMA LISTA DE USU�RIO
		List<Usuario> lista = new ArrayList<>();
		
		//PODE CRIAR USU�RIO DESSA FORMA
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
				
		//OU DESSA FORMA PARA CRIAR USU�RIO NA LISTA
		lista.add(new Usuario("Del"));
		lista.add(new Usuario("Anderson"));
		lista.add(new Usuario("Aelson"));
		lista.add(new Usuario("Jo�o"));
		lista.add(new Usuario("Geo"));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		System.out.println("acessando pelo id " +lista.get(3)); //acessa pelo �ndice
		
		lista.remove(2); // remove pelo �ndice
		lista.remove(new Usuario("Del")); // remove a partir de um objeto
		
		System.out.println("Tem? " + lista.contains(new Usuario("Jo�o")));
		
		
	}

}
