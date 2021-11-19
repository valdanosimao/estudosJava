package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste02 {

	public static void main(String[] args) {
		
		Calculo calc = (a, b) -> {return a + b;};		
		System.out.println(calc.executar(10, 5));
		//QUANDO COLOCAMOS O PAR DE CHAVES EXPL�CITO, � OBRIGAT�RIO INSERIR O RETURN
		//QUANDO TEM PAR DE CHAVES PODER INSERIR MAIS DE UMA SENTEN�A DE C�DIGO
		
		BinaryOperator<Double> calc2 = (a, b) -> {return a + b;};		
		System.out.println(calc2.apply(10.5, 5.7)); //USEI A INTERFACE DO JAVA, N�O PRECISEI DA INTERFACE CALCULO
		
		calc2 = (c,d) -> c * d;
		System.out.println(calc2.apply(40.0, 2.0));
		
		calc2 = (e,f) -> e - f;
		System.out.println(calc2.apply(25.0, 10.0));		
		//QUANDO "N�O" COLOAMOS O PAR DE CHAVES, O JAVA ENTENDE QUE J� TEM O RETURN
		//O JAVA INSERE O RETURN DE MANEIRA IMPL�CITA
		//QUANDO N�O TEM O PAR DE CHAVES, S� PODE TER UMA SENTEN�A DE C�DIGO	
	
		
		//DESSA FORMA N�O PRECISAMOS CRIAR UMA INTERFACE, E V�RIAS CLASSES IMPLEMENTANDO-A, PARA FAZER V�RIAS OPERA��ES
		//POR�M N�O PRECISAMOS CRIAR UMA INTERFACE CALCULO, POIS O JAVA TEM UMA INTERFACE QUE J� FAZ ISSO, BINARYOPERATOR
	}

}
