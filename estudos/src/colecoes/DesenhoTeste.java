package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesenhoTeste {

	public static void main(String[] args) {
		
		List<DesenhoComparable> desenhos =  new ArrayList<>(6);
		desenhos.add(new DesenhoComparable (12,"Dagron Ball Z" , 50.54));
		desenhos.add(new DesenhoComparable (18,"Cavaleiros do Zodiacos", 85.98));
		desenhos.add(new DesenhoComparable (24,"Pokemon",98.74));
		desenhos.add(new DesenhoComparable (5,"Digimon",25.41));
		desenhos.add(new DesenhoComparable (76,"Bersek", 12.11));
		
		for(DesenhoComparable ordemInsercao: desenhos) {
			System.out.println("Ordem Inserção " + ordemInsercao);
		}
		
		System.out.println("---------------------------------");
		
		
	Collections.sort(desenhos); //PARA FUNCIONAR A CLASSE DESENHO IMPLEMENTOU A INTERFACE COMPARABLE E SOBRESCREVEU O MÉTODO 'COMPARETO'
		
		for(DesenhoComparable ordemOrganizado: desenhos) {
			System.out.println("Ordem Organizada " + ordemOrganizado);
		}
		
	}

}
