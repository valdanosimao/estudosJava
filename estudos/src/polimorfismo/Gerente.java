package polimorfismo;

public class Gerente extends Funcionario {
	
	private double pnl;
	
	public Gerente(String nome, double salario, double pnl){
		super(nome, salario);	
		this.pnl = pnl;
	}

	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}

	@Override
	public void pagamento() {
		this.setSalario(this.getSalario() + pnl);		
	}
}
