package relacionamentoEntreObjetos;

public class Aluno {
	
	private String nome;
	private String rg;
	private String cpf;
	private int matricula;
	private int idade;
	
	//dentro de aluno, criamo um novo objeto (Relacionamento entre Objetos) Aluno tem uma disciplina
	private Disciplina disciplina = new Disciplina();
	
	public Aluno() {
		
	}	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", matricula=" + matricula + ", idade=" + idade
				+ ", disciplina=" + disciplina + "]";
	}

	public Aluno(String nome, String rg, String cpf, int matricula, int idade, double nota1, double nota2, double nota3,
			double nota4) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.matricula = matricula;	
	}	

	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public double getMediaAluno() { //PEGUEI O ATRIBUTO GETNOTA DO OBJETO DISCIPLINA
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;				
	}
	
	public boolean getAlunoAprovado() {
		if(this.getMediaAluno() >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
}