package exception2;

public class LancandoExceptions {

	public static void main(String[] args) {
		
		dividirNumeros(1, 0);

	}
	
	/**
	 * 
	 * @param a
	 * @param b não pode ser zero
	 * @return
	 */
	
	private static int dividirNumeros(int a, int b) {
		//quando fazemos isso, o código abaixo do if, não vai ser executado, até que o if seja false.
		if(b == 0) {
			throw new IllegalArgumentException("Argumento inlegal"); //throw == lançar
		}
		
		try {
			return a / b;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
