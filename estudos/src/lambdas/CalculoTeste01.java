package lambdas;

public class CalculoTeste01 {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 5));		
		//POLIMORFISMO
		//MESMO VARIAVEL USANDO O POLIMORFISMO, USANDO A MESMA INST�NCIA 
		//SOMA E MULTIPLICAR, � POSS�VEL PQ
		//IMPLEMENTA A MESMO INTERFACE C�LCULO
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 5));
		
		//COM LAMBDAS, N�O PRECISAMOS CRIAR UMA INTERFACE, E V�RIAS CLASSES IMPLEMENTANDO-A, PARA FAZER V�RIAS OPERA��ES
		
		
		
		
	}

}
