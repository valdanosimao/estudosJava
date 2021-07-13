package relacionamentoClasses2;

public class Carro {
	
	private String marca, cor;
	private int ano;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String cor, int ano) {
		this.setMarca(this.getMarca());
		this.setCor(this.getCor());
		this.setAno(this.getAno());
	}
	
	public String printCarro() {
					return "Marca: " + this.marca + "\nCor:" + this.cor + "\nAno: " + this.ano;			
	}
	
	public void andar() {
		System.out.println("O " + this.marca + " está andando");
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}