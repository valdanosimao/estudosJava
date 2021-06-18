package encapsulamento;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiro;
	private double capCombustivel;
	private double consCombustivel;
	
	//get = consultar
	//set setar um valor

	public String getMarca() { //sem parametro
		return this.marca;
	}

	public void setMarca(String marca) { // com parametro
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsCombustivel() {
		return consCombustivel;
	}

	public void setConsCombustivel(double consCombustivel) {
		this.consCombustivel = consCombustivel;
	}

}


