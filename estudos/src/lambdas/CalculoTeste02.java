package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste02 {

	public static void main(String[] args) {
		
		Calculo calc = (a, b) -> {return a + b;};		
		System.out.println(calc.executar(10, 5));
		//QUANDO COLOCAMOS O PAR DE CHAVES EXPLÍCITO, É OBRIGATÓRIO INSERIR O RETURN
		//QUANDO TEM PAR DE CHAVES PODER INSERIR MAIS DE UMA SENTENÇA DE CÓDIGO
		
		BinaryOperator<Double> calc2 = (a, b) -> {return a + b;};		
		System.out.println(calc2.apply(10.5, 5.7)); //USEI A INTERFACE DO JAVA, NÃO PRECISEI DA INTERFACE CALCULO
		
		calc2 = (c,d) -> c * d;
		System.out.println(calc2.apply(40.0, 2.0));
		
		calc2 = (e,f) -> e - f;
		System.out.println(calc2.apply(25.0, 10.0));		
		//QUANDO "NÃO" COLOAMOS O PAR DE CHAVES, O JAVA ENTENDE QUE JÁ TEM O RETURN
		//O JAVA INSERE O RETURN DE MANEIRA IMPLÍCITA
		//QUANDO NÃO TEM O PAR DE CHAVES, SÓ PODE TER UMA SENTENÇA DE CÓDIGO	
	
		
		//DESSA FORMA NÃO PRECISAMOS CRIAR UMA INTERFACE, E VÁRIAS CLASSES IMPLEMENTANDO-A, PARA FAZER VÁRIAS OPERAÇÕES
		//PORÉM NÃO PRECISAMOS CRIAR UMA INTERFACE CALCULO, POIS O JAVA TEM UMA INTERFACE QUE JÁ FAZ ISSO, BINARYOPERATOR
	}

}
