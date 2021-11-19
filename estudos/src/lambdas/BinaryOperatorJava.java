package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorJava {
	
	//REPRESENTA UMA OPERAÇÃO QUE RECEBE DOIS OPERANDOS(DOIS PARÂMETROS DE ENTRADA
	//DO MESMO TIPO, E PRODUZ UM RESULTADO QUE TENHA O MESMO TIPO DOS OPERANDO

	public static void main(String[] args) {
	
		//INTERFACE FUNCIONAL DO JAVA QUE RECEBE DOIS PARAMETROS DO MESMO TIPO
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2; 
		System.out.println(media.apply(9.8, 5.7)); //APPLY É QUE FAZ A OPERAÇÃO MATEMÁTICA
		//****************************************************
		
		//INTERFACE FUNCIONAL DO JAVA QUE RECEBE MAIS DE UM TIPO
		BiFunction<Double,Double,String> resultado = (n1,n2) -> {			
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(9.7, 4.1));		
		//****************************************************
		
		Function<Double, String> conceito = 
				m -> m >= 7 ?"Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
	}

}
