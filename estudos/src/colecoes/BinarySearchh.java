package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchh {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(8);
		numeros.add(7);
		numeros.add(3);
		
		//(-(ponto de inserção) -1)
		//index 0,1,2,3
		//value 1,8,7,3
		Collections.sort(numeros);//deixa a lista ordenada
		
		//PARA USAR O BINARY SEARCH, É PRECISO PRIMEIRO ORDENAR
		
		System.out.println(Collections.binarySearch(numeros, 1));

	}

}
