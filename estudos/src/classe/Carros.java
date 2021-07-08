package classe;

//1º declaração da classe
public class Carros { 
	
	
	//2º atributos
	String marca; 
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	//3º métodos simples, sem retorno e/ou parâmetro, o void significa vazio ou sem retorno
	void exibirAutonomia () {		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	
	// métodos com return
	double obterAutonomia() {		
		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	
	//parâmetro
	double calcularCombustivel (double km) {						
	double qtdCombustivel = km/consumoCombustivel;	
	return qtdCombustivel;
	
	}
		
}
