package heranca0;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Valdao" , "077.323.434-65");
		Funcionario func = new Funcionario("Tatiana","343.434.657-43","Rua do JAVA");		
		
		pessoa.imprime();
		System.out.println("===================================");
		func.imprime();
		
	}

}
