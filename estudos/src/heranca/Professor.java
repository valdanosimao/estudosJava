package heranca;

public class Professor extends Pessoa {
	
	//Atributos
	private String especialidade;
	private double salario;
		
	//M�todos
	public void receberAumento() {
		this.setSalario(this.getSalario() + 200);
	}
	
	//M�todos Especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}		
	

}
