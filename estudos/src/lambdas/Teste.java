package lambdas;

public class Teste {

	public static void main(String[] args) {
		
		
		//Calculo somar = new Calculo(); Errado, classe abstrada não se 
		//instância objetos
		
		
		//Duas formas lambdas somar
		Calculo soma = (a , b) -> { 
		return a + b;
		};
		System.out.println(soma.executar(3, 4));
		
		//sem o par de chaves, só pode ter uma unica sentença de código
		Calculo soma2 = (i , y) -> i + y;
		System.out.println(soma2.executar(8, 9));
		
		Calculo soma3 = (i , y) -> i * y;
		System.out.println(soma3.executar(8, 9));
		
		//Duas formas lambdas multiplicar
		Calculo multiplicar = (a , b) -> { 
		return a * b;
		};
		System.out.println(multiplicar.executar(10, 29));
		
		Calculo multiplicar2 = (a , b) -> a * b;
		System.out.println(multiplicar2.executar(88, 229));

	}

}
