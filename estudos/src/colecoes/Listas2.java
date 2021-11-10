package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {

	public static void main(String[] args) {
	
		Smartphones phones = new Smartphones("Sansung", "Amarelo", 123);
		Smartphones phones2 = new Smartphones("Nokia", "Branco", 456);
		Smartphones phones3 = new Smartphones("Sony", "Preto", 789);
		
		List<Smartphones> celulares = new ArrayList<>();
		celulares.add(phones);
		celulares.add(phones2);
		celulares.add(phones3);
		
		for(Smartphones cel:celulares) {
			System.out.println(cel);
		}
		
		System.out.println(celulares.contains(phones3));//tem?
	}

}
