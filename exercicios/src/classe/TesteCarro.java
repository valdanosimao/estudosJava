package classe;

public class TesteCarro {

	public static void main(String[] args) {
		
		
		Carros van = new Carros(); //inst�ncia
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//simples
		van.exibirAutonomia(); //por boas pr�ticas, nome de m�toco come�a com VERBO, ex: exibir, calcular, andar, dirigir etc
		
		
		//com return
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro � " + autonomia);	
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustiver10 = " + qtdCombustivel10);
		System.out.println("qtdCombustiver15 = " + qtdCombustivel15);
			
		
		}
		
		
	}



