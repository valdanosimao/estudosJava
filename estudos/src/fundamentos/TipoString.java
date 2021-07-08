package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal".charAt(2));  //qual a letra no índice 0 ou etc...
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.equals(s));
		System.out.println(s.equalsIgnoreCase(s));
		
		var nome = "pedro";
		var sobreNome = "Santos";
		var idade = 33;
		var salario = 1245.987;
		
		//System.out.println("Nome " + nome + " Sobre nome " + sobreNome + " Idade");
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f ." ,nome ,sobreNome, idade, salario);
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f ." ,nome ,sobreNome, idade, salario);
		System.out.println(frase);
		
		// %s (String)
		// %d (Inteiros)
		// %f (reais)
		
		// %.3f (decidir quantos casas decimais)

	}

}
