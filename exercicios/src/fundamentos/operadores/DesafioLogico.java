package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = comprouSorvete;
		
		System.out.println("Comprou tv 50? " + comprouTV50);
		System.out.println("Comprou tv 32? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		//operador Un�rio
		System.out.println("Mais saud�vel? " + !maisSaudavel);
	
		

	}

}
