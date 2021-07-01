package heranca2;

public class Bolsista extends Aluno {

	private int bolsa;
	
	public void RenovarBolsa() {
		System.out.println("Renovando bolsa de Aluno " + this.getNome());
	}
	
	@Override //Sobrepor
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "É Bolsista, mensalidade diferenciada");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
