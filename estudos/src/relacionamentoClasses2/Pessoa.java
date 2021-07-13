package relacionamentoClasses2;

public class Pessoa {

	// atributos
	private String nome, sexo;
	private int idade;
	private Endereco end;// atributos end, do tipo Endereco, pessoa "tem um"
	public Carro car;

	// construtor 01
	public Pessoa() {

	}

	// construtor 02
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;

	}

	// construtor 03
	public Pessoa(String nome, String sexo, int idade, Endereco end, Carro car) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.end = end;
	
	}

	// métodos
	public String printPessoa() {
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\n" + end.printEndereco();
		
	}	
	
	// métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public Carro getCar() {
		return car;
	}

	public void setCar(Carro car) {
		this.car = car;
	}
	
	

}
