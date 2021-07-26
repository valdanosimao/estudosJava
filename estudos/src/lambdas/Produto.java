package lambdas;

public class Produto {
	
	public String nome;
	public double preco;
	public double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
	}
	
	
	
	

}
