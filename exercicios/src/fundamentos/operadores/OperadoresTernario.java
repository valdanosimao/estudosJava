package fundamentos.operadores;

public class OperadoresTernario {

	public static void main(String[] args) {
		
		double media = 8.6;		
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		
		System.out.println("O Aluneo est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7 ;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "n�o";
		
		System.out.println("Tem desconto? " + resultado);

	}

}
