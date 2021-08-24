package temporario2;

public class Servico {
	
	private Cliente contratante;
	private Funcionario atendente;
	private String dataContrato;
	
	
	public Cliente getContratante() {
		return contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getAtendente() {
		return atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}
	public String getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(String dataContrato) {
		this.dataContrato = dataContrato;
	}	
	
	
	@Override
	public String toString() {
		return "Contratante = " + contratante + "\nAtendente = " + atendente + "\nData do Contrato = " + dataContrato;
	}	
	

}
