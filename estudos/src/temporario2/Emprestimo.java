package temporario2;

public class Emprestimo extends Servico{

	private double valor;
	private double taxa;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "Valor = " + valor + "\nTaxa = " + taxa;
	}
	
	
	
}
