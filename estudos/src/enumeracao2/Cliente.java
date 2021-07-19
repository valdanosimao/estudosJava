package enumeracao2;

public class Cliente {

	//enum
	public enum TipoPagamento{
		AVISTA,APRAZO
	}
	
	//atributos
	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipopagamento;

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTipo: " + tipo + "\nTipopagamento: " + tipopagamento;
	}

	//construtor
	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.tipopagamento = tipoPagamento;
	}
	
	//métodos especiais	
	
	public String getNome() {
		return nome;
	}
	public TipoPagamento getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(TipoPagamento tipopagamento) {
		this.tipopagamento = tipopagamento;
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
