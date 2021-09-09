package streams;

import java.util.Objects;

public class Alunos {

	String nome;
	double nota;
	
	public Alunos(String nome, double nota) {	
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
}
