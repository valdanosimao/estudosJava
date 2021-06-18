package sobrecargaOverload;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		calc.soma(3,5);
		calc.soma(4.6, 7.9);
		calc.soma(2, 3, 7);

	}

}
