package colections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Carla");
		usuarios.put(3, "Valdano");
		usuarios.put(4, "Krool");
		
		System.out.println(usuarios.size()); // tamanho
		System.out.println(usuarios.isEmpty()); // está vazio/
		
		System.out.println(usuarios.keySet());// retorna os conjutnso da chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna chave e valores
		
		System.out.println(usuarios.containsKey(2));// verifica chave 2
		System.out.println(usuarios.containsValue("krool")); // verifica valor krool
		
		System.out.println(usuarios.get(2)); // consulta o valor da chave 2
		
		//pecorre as chaves
		for(int chave : usuarios.keySet()) {
		System.out.println(chave);
		}
		
		// pecorre os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//pecorre os dois ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		
		
		
	}
	
	

}
