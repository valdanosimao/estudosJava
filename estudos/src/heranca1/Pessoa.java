package heranca1;

public class Pessoa {
	
	//Atributos
	private	String nome;
	private int idade;
	private String sexo;
	
	//M�todos
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1); //this.idade ++ ou this.idade = this.idade + 1
	}
	
	//M�todos Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
