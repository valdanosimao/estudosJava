package relacionamentoClasses;

public class Lutador {

	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	// m�todos p�blicos
	public void apresentar() {
		System.out.println("--------------------------------------------------------");
		System.out.println("CHEGOU A HORA DE APRESENTAR O LUTADOR " + this.getNome());
		System.out.println("DIRETAMENTE DE " + this.getNacionalidade());
		System.out.println("COM " + this.getIdade() + " ANOS E " + this.getAltura() + " METROS");
		System.out.println("PESANDO " + this.getPeso() + "KG");
		System.out.println(this.getVitorias() + " VIT�RIAS");
		System.out.println(this.getDerrotas() + " DERROTAS");
		System.out.println(this.getEmpates() + " EMPATES");

	}

	public void status() {
		System.out.println(this.getNome() + " � UM PESO " + this.getCategoria());
		System.out.println("GANHOU " + this.getVitorias() + " VEZES");
		System.out.println("PERDEU " + this.getDerrotas() + " VEZES");
		System.out.println("EMPATOU " + this.getEmpates() + " VEZES");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		// this.vitorias = this.vitorias + 1; OUTRA OP��O!!!
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// Construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// M�todos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv�lido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Peso Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso M�dio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Inv�lido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
