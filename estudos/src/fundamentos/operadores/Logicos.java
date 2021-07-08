package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // e
		System.out.println(condicao1 || condicao2); // ou
		System.out.println(condicao1 ^ condicao2); // ou exclusivo
		System.out.println(!condicao1); //negaçao
		System.out.println(!condicao2); //negaçao
		
		// Tabela verdade E (AND)
		
		System.out.println(true && true); //verdadeiro
		System.out.println(true && false);//falso
		//System.out.println(false && true);//falso
		//System.out.println(false && false);//falso
		
		// Tabela verdade OU (OR)
		
		//System.out.println(true || true); //verdadeiro
		//System.out.println(true || false);//verdadeiro
		System.out.println(false || true);//verdadeiro
		System.out.println(false || false);//falso	
		
		// Tabela verdade OU exclusivo (XOR)
		
		System.out.println(true ^ true); //falso	
		System.out.println(true ^ false);//verdadeiro
		System.out.println(false ^ true);//verdadeiro
		System.out.println(false ^ false);//falso	
		
		// Tabela verdade OU exclusivo NOT
		
		System.out.println(!true);//falso
		System.out.println(!false);//verdadeiro
		
		
	}

}
