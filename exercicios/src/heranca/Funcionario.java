package heranca;

public class Funcionario extends Pessoa {
	
	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//M�todos
	public void mudaTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	//M�todos Especiais
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", trabalhando=" + trabalhando + "]";
	}
	
	

}
