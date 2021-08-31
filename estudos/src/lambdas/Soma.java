package lambdas;

//DESTA FORMA USO MAIS CÓDIGOS, PREFERECIALMENTE USAR LAMBDAS
public class Soma implements Calculo{
	
	@Override
	public double executar (double a , double b) {
		return a + b;		
	}
}
