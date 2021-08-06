package listas;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {

		private String nome;
		
		//Pessoas "tem uma lista" de contatos
		List<Contatos> contato = new ArrayList<>();		
		
		
		public Pessoas() {
	
		}		

		public Pessoas(String nome, List<Contatos> contato) {			
			this.nome = nome;
			this.contato = contato;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Contatos> getContato() {
			return contato;
		}

		public void setContato(List<Contatos> contato) {
			this.contato = contato;
		}

		@Override
		public String toString() {
			return "Nome = " + nome + "\nContato = " + contato + "\n";
		}		
	
		
}


//quando criado uma lista desta forma, ele cria um array de Objetos
// não é comum usar desta forma
	/*List contato = new ArrayList();		
	contato.add("Valdano");
	
	for(Object nome : contato) {
		System.out.println(contato);
	}*/
//***********************************************************************