package lambdas;

//desta forma eu afirmo que � uma interface funcinal
// e quando outro dev for ver, ele vai est� ciente
//ela fora ter um �nico m�todo
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
}
