package streams;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Valdano ", "Tati" , "Krool");
		
		//Usando for normal
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		System.out.println("************************");
		
		//Usando ForEach
		for (String apv : aprovados) {
			System.out.println(apv);
		}
		
		System.out.println("************************");
		
		//Usando Iterator
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("************************");
		
		//Usando Stream
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}

}
