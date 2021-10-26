package exception2;

import java.util.Scanner;

public class TesteExcecaoCustomizada {

	public static void main(String[] args) {
		
		try {
			logar();
		} catch (ExcecaoCustomizadaException e) {			
			e.printStackTrace();
		}
		
	}	
	
	@SuppressWarnings("resource")
	private static void logar () throws ExcecaoCustomizadaException {
		Scanner scan = new Scanner(System.in);
		String usernameDB = "admin";
		String senhaDB = "123";
		System.out.println("Usu�rio");
		String usuarioDigitado = scan.next();
		System.out.println("Senha");
		String senhaDigitada = scan.next();
		if(!usernameDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
			throw new ExcecaoCustomizadaException("Usu�rio ou senha inv�lida");
		}
		
		System.out.println("Usu�rio logado com sucesso");
		

		scan.close();
	}
}