package exception2;

public class MultiplasExceptions {

	public static void main(String[] args) {

		try {
			throw new IllegalAccessException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Dentro do IllegalAccessException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Dentro do IndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println(" Dentro do ArithmeticException");
		} catch (IllegalAccessException e) {
			System.out.println(" Dentro do IllegalAccessException");

		} // A exceção mais genéricas, tem que ficar sempre no final

	}

}
