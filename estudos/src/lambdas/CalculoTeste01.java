package lambdas;

public class CalculoTeste01 {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 5));		
		//POLIMORFISMO
		//MESMO VARIAVEL USANDO O POLIMORFISMO, USANDO A MESMA INSTÂNCIA 
		//SOMA E MULTIPLICAR, É POSSÍVEL PQ
		//IMPLEMENTA A MESMO INTERFACE CÁLCULO
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 5));
		
		//COM LAMBDAS, NÃO PRECISAMOS CRIAR UMA INTERFACE, E VÁRIAS CLASSES IMPLEMENTANDO-A, PARA FAZER VÁRIAS OPERAÇÕES
		
		
		
		
	}

}
