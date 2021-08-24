package temporario;

import java.util.Objects;

public class Funcionario extends Pessoa{

	private double salario;
	private double ticket;
	
	public Funcionario() {
		
	}

	public Funcionario(double salario, double ticket) {		
		this.salario = salario;
		this.ticket = ticket;
	}

	public void imprime() {
	super.imprime();	
	System.out.println("Salário = " +this.salario);
	System.out.println("Ticket = " +this.ticket);
		
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getTicket() {
		return ticket;
	}

	public void setTicket(double ticket) {
		this.ticket = ticket;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salario, ticket);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario)
				&& Double.doubleToLongBits(ticket) == Double.doubleToLongBits(other.ticket);
	}	
	

}
