package lambdas;

public class Teste {

	public static void main(String[] args) {
		
		
		//Calculo somar = new Calculo(); Errado, classe abstrada não se 
		//instância objetos
		
		
		//Duas formas lambdas somar
		Calculo soma = (a , b) -> { return a + b;};
		Calculo soma2 = (i , y) -> i + y;
		
		System.out.println(soma.executar(3, 4));
		System.out.println(soma2.executar(8, 9));
		
		//Duas formas lambdas multiplicar
		Calculo multiplicar = (a , b) -> { return a * b;};
		Calculo multiplicar2 = (a , b) -> a * b;

		System.out.println(multiplicar.executar(10, 29));
		System.out.println(multiplicar2.executar(88, 229));
	}

}
