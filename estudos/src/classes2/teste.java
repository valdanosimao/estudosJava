
package classes2;

public class teste {
    public static void main(String[] args) {
        Estudantes aluno = new Estudantes();
        
        aluno.idade = 18;
        aluno.matricula = "123434";
        aluno.nome = "Valdano";
        
        System.out.println(aluno.matricula);
        System.out.println(aluno.idade);
        System.out.println(aluno.nome);
    }
}
