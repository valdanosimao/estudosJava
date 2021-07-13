package heranca0;

public class Funcionario extends Pessoa{
	
	private String endereco;
	
	public Funcionario() {
		
	}
	
	public Funcionario( String endereco) {
		this.setEndereco(endereco);
	}
	
	public Funcionario(String nome, String cpf, String endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
	}
	
	public void imprime() {
		super.imprime();//sobrescrevendo o método de pessoa
		System.out.println(this.endereco);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
