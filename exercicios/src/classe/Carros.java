package classe;

//1� declara��o da classe
public class Carros { 
	
	
	//2� atributos
	String marca; 
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	//3� m�todos simples, sem retorno e/ou par�metro, o void significa vazio ou sem retorno
	void exibirAutonomia () {		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "km");
	}
	
	
	// m�todos com return
	double obterAutonomia() {		
		System.out.println("M�todo obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	
	//par�metro
	double calcularCombustivel (double km) {						
	double qtdCombustivel = km/consumoCombustivel;	
	return qtdCombustivel;
	
	}
		
}
