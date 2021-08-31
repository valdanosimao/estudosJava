package lambdas;

//desta forma eu afirmo que é uma interface funcional
//e quando outro dev for ver, ele vai está ciente
//de que ela só pode ter um único método
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
}
