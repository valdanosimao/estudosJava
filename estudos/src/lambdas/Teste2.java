package lambdas;

import java.util.function.BinaryOperator;

public class Teste2 {

	public static void main(String[] args) {		
		
		//Calculo somar = new Calculo(); Errado, classe abstrada não se 
		//instância objetos	
		
		//NÂO int -> Double
		//OK double -> Double
		
		//Duas formas lambdas somar
		BinaryOperator<Double> soma = (a , b) -> { return a + b;};
		System.out.println(soma.apply(3.0, 4.0));
		
		BinaryOperator<Double> soma2 = (i , y) -> i + y;
		System.out.println(soma2.apply(8.9, 9.6));		
		
		//Duas formas lambdas multiplicar
		BinaryOperator<Integer> multiplicar = (a , b) -> { return a * b;};
		System.out.println(multiplicar.apply(3, 5));		
		
		BinaryOperator<Integer> multiplicar2 = (a , b) -> a * b;
		System.out.println(multiplicar2.apply(5, 2));
	}

}
