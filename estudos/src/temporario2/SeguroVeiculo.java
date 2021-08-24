package temporario2;

public class SeguroVeiculo extends Servico {

	private String carro;
	private double valorSeguro;
	private double franquia;
	
	
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	
	@Override
	public String toString() {
		return "Carro = " + carro + "\nValor do Seguro = " + valorSeguro + "\nFranquia = " + franquia;
	}
	
	
	
	
}
