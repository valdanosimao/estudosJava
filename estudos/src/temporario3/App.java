package temporario3;

import java.util.function.DoubleBinaryOperator;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
	
		Filho filho = new Filho();
		Neto neto = new Neto();
		Neto2 neto2 = new Neto2();
		
		filho.dizerNome();
		filho.dizerCidade();
		filho.dizerIdade();
		filho.setFamilia("Trólóló");
		System.out.println(filho.getFamilia());
		
		System.out.println();
		
		neto.dizerNome();
		neto.dizerCidade();
		neto.dizerIdade();
		neto.setFamilia("Buscapé");
		System.out.println(neto.getFamilia());
		
		System.out.println();		
		
		neto2.dizerNome();
		neto2.dizerCidade();
		neto2.dizerIdade();
		neto2.setFamilia("B");
		
	
		
		
	}

}
