package heranca1;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Valdano");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");	
		p2.setSexo("Feminino");
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.79);
		p4.setSetor("Estoque");		
		
		p4.fazerAniversario();
		
	//	p2.receberAumento();
		
		System.out.println(p1.getNome());
		System.out.println(p2.getSexo());
		System.out.println(p3.getNome());
		System.out.println(p4.getSetor());
		
	}

}
