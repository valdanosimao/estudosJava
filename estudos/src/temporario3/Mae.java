package temporario3;

public abstract class Mae {
	
	private String familia;

	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public abstract void dizerNome();
	public abstract void dizerIdade();
	public abstract void dizerCidade();

}
