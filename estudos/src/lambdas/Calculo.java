package lambdas;

//desta forma eu afirmo que � uma interface funcional
//e quando outro dev for ver, ele vai est� ciente
//de que ela s� pode ter um �nico m�todo
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
}
