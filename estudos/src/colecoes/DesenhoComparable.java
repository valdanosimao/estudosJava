package colecoes;

import java.util.Objects;

public class DesenhoComparable implements Comparable<DesenhoComparable> {

	private Long id;
	private String nome;
	private double preco;
	
	public DesenhoComparable(long id, String nome, double preco) {		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}	
	
	@Override
	public String toString() {
		return "Desenho [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DesenhoComparable other = (DesenhoComparable) obj;
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public int compareTo(DesenhoComparable desenho) {
//		if(this.id < desenho.getId() ) {
//			return -1;
//		}else if(this.id.equals(desenho.getId())) {
//			return 0;
//		}else {
//		return 0;
//	}
		//return this.id.compareTo(desenho.getId()); //O Wapper Long já tem o compareTO, não funciona com tipo primitivo
		//return Double.valueOf(preco).compareTo(desenho.getPreco()); //Dessa forma dá para usar o compareTo com tipo primitivos
		return this.nome.compareTo(desenho.getNome()); //comparando com String nome
	}	
	
	
	
	
}
