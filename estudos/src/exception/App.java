package exception;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.source.tree.CatchTree;

public class App {
	
	public static void main(String[] args) {
		
		try {
		
		Scanner scan = new Scanner(System.in);
		
		Banco app = new Banco();
		app.numConta = 12345;
		app.saldo = 500.76;	
		
		app.numCc();
		System.out.printf("O tipo de sua conta é %s \n" , app.numCc());
	
		System.out.println("Olá, por favor digite seu nome: ");
			String nome = scan.next();
			System.out.println("prazer, " + nome + ", Por favor Digite 1 para saldo, 2 para depositar e 3 para sacar");
			int menu = scan.nextInt();	
			
			if(menu == 1) {
				System.out.printf("Seu saldo é:%f" , app.saldo);
			}
			
			else if(menu == 2) {
			System.out.println("Por favor digite o valor do depósito ");
			double deposito = scan.nextDouble();			
			app.depositar(deposito);
			System.out.printf("Você depositou R$%.2f agora seu saldo é R$%.2f" , deposito , app.saldo);			
			}
			
			else if(menu == 3) {
			System.out.println("Por favor digite o valor do saque.");
			double saque = scan.nextDouble();
			app.sacar(saque);
			System.out.printf("Você sacou R$%.2f agora seu saldo é R$%.2f" , saque , app.saldo);
			}
			
			else {
			System.out.println("Numero inválido, por favor Digite 1 para depositar ou 2 para sacar");
		}	
		
		scan.close();	
		
	}
	catch (Exception e) {
		e.printStackTrace(); //imprime erro no console java
		JOptionPane.showInternalMessageDialog(null, e);
	}
	
	}
}
