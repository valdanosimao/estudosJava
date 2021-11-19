package lambdas;

@FunctionalInterface
public interface Calculo {
	double executar(double a, double b); //TODO MÉTODO DA INTERFACE É PUBLIC ABSTRACT
	
//	default String legal() {
//		return "Legal";      //O JAVA ACEITA OUTRO MÉTODO, SENDO DEFAULT, QUE NÃO SEJA ABSTRACT
//	}
	
//	static String muitoLegal() {
//		return "muito legal"; // O JAVA ACEITA OUTRO MÉTODO STATIC NÃO ABSTRACT
//	}
}


//LEMBRANDO TODA INTERFACE É PUBLIC ABSTRACT

//desta forma eu afirmo que é uma interface funcional
//e quando outro dev for ver, ele vai está ciente
//de que ela só pode ter um único método

//PARA DEFINIR LAMBDAS EM CIMA DE INTERFACE, VOCÊ PRECISA TER UMA INTERFACE FUNCIONAL