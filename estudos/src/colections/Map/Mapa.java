package colections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		//NO MAP PARA ADCIONAR SE USA O PUT, AO CONTRÁRIO DE OUTRAS COLETIONS
		//ELE ADICIONA CASO NÃO EXISTIR, E SUBSTITUI CASO JÁ EXISTA
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Erasmo"); //ELE SUBSTITUIU A CHAVE ANTIGA (1), ROBERTO AGORA É ERASMO
		usuarios.put(2, "Carla");
		usuarios.put(3, "Valdano");
		usuarios.put(4, "Krool");
		
		System.out.println(usuarios.size()); // tamanho
		System.out.println(usuarios.isEmpty()); // está vazio/
		
		System.out.println(usuarios.keySet());// retorna os conjutnso da chaves EX: 1,2,3,4
		System.out.println(usuarios.values()); // retorna os valores EX: ERASMO, CARLA, VALDANO ETC.
		System.out.println(usuarios.entrySet()); // retorna chave e valores EX: 1 = ERAMOS, 2 = CALA
		
		System.out.println(usuarios.containsKey(2));// verifica chave 2
		System.out.println(usuarios.containsValue("krool")); // verifica valor krool
		
		System.out.println(usuarios.get(4)); // consulta o valor da chave 2
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(2, "Carla"));
		
		//pecorre as chaves
		for(int chave : usuarios.keySet()) {//PODE SER INT OU INTEGER
		System.out.println(chave);
		}
		
		// pecorre os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//pecorre os dois ao mesmo tempo
		//O PACOTE DO ENTRE É O JAVA,UTIL.MAP
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		
		
		
	}
	
	

}
