package exception;

public class Banco {
	
	int numConta;
	String tipoConta;
	double saldo;
		
	Banco(){
		
	}	
	
	public int status() {
		return numConta;		
	}
	
	public double depositar(double dep) {
		return this.saldo = saldo + dep;
	}
	
	public double sacar(double saq) {
		return this.saldo = saldo - saq;
	}
	
	public String numCc() {
		return tipoConta = "Corrente";
	}
	
	
	
}
