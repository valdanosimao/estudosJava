package polimorfismo;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;	
	
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract void pagamento();
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
