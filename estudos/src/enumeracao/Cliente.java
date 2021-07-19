package enumeracao;

public class Cliente {

	//atributos
	private String nome;
	private TipoCliente tipo;	
	
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nTipo: " + tipo;
	}

	//construtor
	public Cliente(String nome, TipoCliente tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	
	//métodos especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	
	
 }
