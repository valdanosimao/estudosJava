package classeAbstrata;

public abstract class Conta {
	
	//atributo
	private String nomeCliente;
	private String nomeBanco;	
	private int numConta;	
	
	//construtor padrão
	public Conta() {
		super();

	}	
	
	//construtor
	public Conta(String nomeCliente ,String nomeBanco,int numConta) {
		this.nomeCliente = nomeCliente;
		this.nomeBanco = nomeBanco;		
		this.numConta = numConta;
	}	
	
	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", nomeBanco=" + nomeBanco + ", numConta=" + numConta
				+ ", tipoDeConta=";
	}	
	
	public abstract void calcular();
	

	//métodos especiais	
	public String getNomeBanco() {
		return nomeBanco;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}	
	
	
}
