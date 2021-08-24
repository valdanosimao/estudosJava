package temporario;

public class App {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Tati");
		pessoa.setCpf(1223423);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(1237.64);
		funcionario.setTicket(324);
		funcionario.setNome("Val");
		funcionario.setCpf(1234454);
		
		funcionario.imprime();
		System.out.println("*****");
		pessoa.imprime();
		
	}

}
