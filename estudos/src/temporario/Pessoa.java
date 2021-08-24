package temporario;

import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private int cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int cpf) {		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void imprime() {		
		System.out.println("Nome = " +this.nome);
		System.out.println("Cpf = " +this.cpf);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome);
	}	
	

}
