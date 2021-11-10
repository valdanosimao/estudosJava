package colecoes;

public class Smartphones {

	private String marca;
	private String cor;
	private int serialNumber;
	
	public Smartphones(String marca, String cor, int serialNumber) {		
		this.marca = marca;
		this.cor = cor;
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Smartphones [marca=" + marca + ", cor=" + cor + ", serialNumber=" + serialNumber + "]";
	}
	
	
}
