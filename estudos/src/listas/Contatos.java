package listas;

public class Contatos {
	
	private String endereco;
	private String email;
	private String celular;		
	
	
	public Contatos(String endereco, String email, String celular ) {		
		this.endereco = endereco;
		this.email = email;
		this.celular = celular;
		
	}
	
	public Contatos () {
		
	}

	@Override
	public String toString() {
		return "Endereco =" + endereco + "\nEmail =" + email  + "\nCelular =" + celular + "\n";
	}
	

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}	
	

}
