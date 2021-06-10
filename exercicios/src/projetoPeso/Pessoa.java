package projetoPeso;

public class Pessoa {
	
	//atributos
	String nome;
	double peso;
		
	//construtor
	Pessoa (String nome , double peso){
		this.nome = nome;
		this.peso = peso;
	}
		
	//método
	void comer(Comida comida) {
		if(comida != null) {
			this.peso = comida.peso ;
		}
		
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " kgs.";
	}
}
	
	
	

