package temporario2;

public class Cliente extends Funcionario {

	private boolean ativo;
	private Funcionario funcionario;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Ativo = " + ativo + "\nFuncionario = " + funcionario;
	}
	
	
	
}
