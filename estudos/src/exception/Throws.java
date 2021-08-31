package exception;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {

		/*o eclipe vai reclamar e dá duas opções, ou joga
		  a exceção para frente ou insere o try catch */
		System.out.println("Entre com um número decimal");	
		try {
			double num = lerNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}
	
	/*
	 * ESSAS INFORÇAÕES É MOSTRADA APENAS NO LOG
	 * E NUNCA MOSTRAR AO USUÁRIO ESSAS INFORMAÇÕES
	 *java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at exception.Throws.lerNumero(Throws.java:27)
	at exception.Throws.main(Throws.java:13)
	 */
	
	/*quando colocamos throws Exception, a responsábilidade de tratar
	 as exceções, quando for utilizara o método lerNumero
	 é do desenvolvedor*/
	public static double lerNumero() throws Exception {
	Scanner scan = new Scanner(System.in);	
	double num = scan.nextDouble();
	scan.close();
	return num;
	
	}
}
