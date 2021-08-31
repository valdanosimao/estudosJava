package exception;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {

		/*o eclipe vai reclamar e d� duas op��es, ou joga
		  a exce��o para frente ou insere o try catch */
		System.out.println("Entre com um n�mero decimal");	
		try {
			double num = lerNumero();
			System.out.println("Voc� digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace();
		}

	}
	
	/*
	 * ESSAS INFOR�A�ES � MOSTRADA APENAS NO LOG
	 * E NUNCA MOSTRAR AO USU�RIO ESSAS INFORMA��ES
	 *java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at exception.Throws.lerNumero(Throws.java:27)
	at exception.Throws.main(Throws.java:13)
	 */
	
	/*quando colocamos throws Exception, a respons�bilidade de tratar
	 as exce��es, quando for utilizara o m�todo lerNumero
	 � do desenvolvedor*/
	public static double lerNumero() throws Exception {
	Scanner scan = new Scanner(System.in);	
	double num = scan.nextDouble();
	scan.close();
	return num;
	
	}
}
