package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//FUNCTION = ACEITA UM �NICO ARGUMENTO E PRODUZ O RESULTADO 
		
		//andThen � um m�todo de composi��o
		
		//funcao que verifica par ou impar
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";  
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado �: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";		
		
		Function<String, String> duvida = 
				valor -> valor + "???";	
		
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(33);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);

	}

}
