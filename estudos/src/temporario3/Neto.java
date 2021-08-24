package temporario3;

public class Neto extends Filho {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public void dizerNome() {
		System.out.println("Meu nome é Neto");
		
	}

	@Override
	public void dizerIdade() {
		System.out.println("Tenho 30 anos");
		
	}

	@Override
	public void dizerCidade() {
		System.out.println("Sou de São Paulo");
		
	}
	

}
