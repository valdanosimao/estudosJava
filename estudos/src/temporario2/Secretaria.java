package temporario2;

public class Secretaria extends Funcionario{

	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Ramal = " + ramal;
	}
	
	
	
}
