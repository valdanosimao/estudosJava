package lambdas;

//desta forma eu afirmo que é uma interface funcinal
// e quando outro dev for ver, ele vai está ciente
//ela fora ter um único método
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
}
