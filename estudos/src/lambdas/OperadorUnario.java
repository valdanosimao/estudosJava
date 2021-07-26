package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
	
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//andThen � um m�todo de composi��o
		int resultado1 = maisDois.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		//o compose � ao contr�rio de andthen ele comea�a pelo �ltimo		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0); //pegue zero, depois fa�a maisDois > vezesDois > aoQuadrado
		
		System.out.println(resultado2);
	}

}
