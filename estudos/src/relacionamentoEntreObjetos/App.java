package relacionamentoEntreObjetos;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno? ");
		String rg = JOptionPane.showInputDialog("Qual o rg do Aluno? ");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do Aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno? ");
		String matricula = JOptionPane.showInputDialog("Qual a matr�cula do Aluno? ");
		String nota1 = JOptionPane.showInputDialog("Qual 1� nota do Aluno? ");
		String nota2 = JOptionPane.showInputDialog("Qual 2� nota do Aluno? ");
		String nota3 = JOptionPane.showInputDialog("Qual 3� nota do Aluno? ");
		String nota4 = JOptionPane.showInputDialog("Qual 4� nota do Aluno? ");
		
		aluno.setNome(nome);
		aluno.setRg(rg);
		aluno.setCpf(cpf);
		aluno.setIdade(Integer.valueOf(idade));//Converte String do jOptionPane para int
		aluno.setMatricula(Integer.valueOf(matricula));//Converte String do jOptionPane para Int
		
		//Converte String em double
		//aluno.setNota1(Double.parseDouble(nota1));
		
		//Converte String em double
		//aluno.setNota2(Double.parseDouble(nota2));
		
		//Converte String em double
		//aluno.setNota3(Double.parseDouble(nota3));
		
		//Converte String em double
		//aluno.setNota4(Double.parseDouble(nota4));
		
		//RELACIONAMENTO ENTRE OBJETOS
		aluno.getDisciplina().setNota1(Double.parseDouble(nota1));		
		aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno.getDisciplina().setNota3(Double.parseDouble(nota3));		
		aluno.getDisciplina().setNota4(Double.parseDouble(nota4));			
		
		System.out.println("M�dia do Aluno � = " + aluno.getMediaAluno());
		System.out.println("resultado = " + (aluno.getAlunoAprovado() ? "Aprovado " : "Reprovado")); //Usando operador tern�rio
		System.out.println(aluno);
		
		//***** n�o precisa criar esta quantidade de c�digo, � s� implementar o toString ******
		/*System.out.println("Nome do Aluno: " + aluno.getNome());
		System.out.println("Rg do Aluno: " + aluno.getRg());
		System.out.println("Cpf do Aluno: " + aluno.getCpf());
		System.out.println("Idade do Aluno: " + aluno.getIdade());
		System.out.println("Matricula do Aluno: " + aluno.getMatricula());*/	


	}

}
