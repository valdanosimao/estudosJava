package colections.setNaoOrdedado;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double >>> Double ele converte para tipo Classe
		conjunto.add(true); //boolean >>> Boolean
		conjunto.add("teste"); //String
		conjunto.add(1); //int >>> Interger
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		
	}

}
