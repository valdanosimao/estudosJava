package lambdas;

@FunctionalInterface
public interface Calculo {
	double executar(double a, double b); //TODO M�TODO DA INTERFACE � PUBLIC ABSTRACT
	
//	default String legal() {
//		return "Legal";      //O JAVA ACEITA OUTRO M�TODO, SENDO DEFAULT, QUE N�O SEJA ABSTRACT
//	}
	
//	static String muitoLegal() {
//		return "muito legal"; // O JAVA ACEITA OUTRO M�TODO STATIC N�O ABSTRACT
//	}
}


//LEMBRANDO TODA INTERFACE � PUBLIC ABSTRACT

//desta forma eu afirmo que � uma interface funcional
//e quando outro dev for ver, ele vai est� ciente
//de que ela s� pode ter um �nico m�todo

//PARA DEFINIR LAMBDAS EM CIMA DE INTERFACE, VOC� PRECISA TER UMA INTERFACE FUNCIONAL