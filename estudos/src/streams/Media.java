package streams;

public class Media {
	
	private double total;
	private int quantidade;
	
	public void adc(double valor) {
		total += valor;
		quantidade++;
	}
	
	public double getValor() {
		return total / quantidade;
	}

}
