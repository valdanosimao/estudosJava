package relacionamentoClasses2;

public class Endereco {

	// atributos
	private String rua, bairro, cidade;
	private int numero, cep;

	// construtor
	public Endereco(String rua, String bairro, String cidade, int numero, int cep) {

		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.cep = cep;
	}

	public Endereco() {

	}
	
	// métodos
	public String printEndereco() {
		return "Logradouro " + this.rua + "\nBairro: " + this.bairro + "\nCidade: " + this.cidade + "\nNúmero: "
			+ this.numero + "\nCep: " + this.cep;
	}

	//métodos especiais
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	

}
