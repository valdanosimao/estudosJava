package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) { //verifica se o número é par
			System.out.println("Número Par");
		}
		
		if(numero % 2 == 1) { //verifica se o número é ímpar
			System.out.println("Número ímpar");
		} 
		
		
		//usando o else
		if(numero % 2 == 0) { 
			System.out.println("Número Par");
		}else {
			System.out.println("Número ímpar");
		}
		
		
		

	}

}
