package classeAbstrata;

public class ContaCorrente extends Conta {
	
	//atributo
	private double saldo;
	private int tipoConta;
	
	//construtor padrão
	public ContaCorrente() {
		
	}	
	
	//construtor
	public ContaCorrente(double saldo, int tipoConta) {		
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}	
	
	//método
	public void tipo() {
		if(this.tipoConta == 1) {
			System.out.println("Sua conta é Conta-Corrente!");			
		}
		else if(this.tipoConta == 2) {
			System.out.println("Sua conta é Conta-Poupança!");
		}
		else {
			System.out.println("Opção inválida");
		}
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + getNomeCliente() + "\nBanco:" + getNomeBanco() + "\nNúmero Conta:"  + getNumConta() + 
				"\nSaldo: " + saldo + "\nTipo de Conta: " + tipoConta ; 
	}	

	//métodos especiais
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		
		this.tipoConta = tipoConta;
	}

	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		
	}
	

}
