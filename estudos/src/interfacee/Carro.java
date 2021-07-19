package interfacee;

public class Carro implements Fabricacao {

	private String marca;
	private int ano;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public void statusFacricado() {
		System.out.println("Carro Fabricado");
		
	}
	@Override
	public double PRECO() {
		System.out.println(100);
		return 0;
	}	
	
}
