package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) { //verifica se o n�mero � par
			System.out.println("N�mero Par");
		}
		
		if(numero % 2 == 1) { //verifica se o n�mero � �mpar
			System.out.println("N�mero �mpar");
		} 
		
		
		//usando o else
		if(numero % 2 == 0) { 
			System.out.println("N�mero Par");
		}else {
			System.out.println("N�mero �mpar");
		}
		
		
		

	}

}
