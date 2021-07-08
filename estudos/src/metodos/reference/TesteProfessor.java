
package metodos.reference;

public class TesteProfessor {
    
    public static void main(String[] args) {
        
        Professor teacher = new Professor ();  //objeto1    
        teacher.cpf = "077.233.456.77";
        teacher.matricula = "92374234jjdas";
        teacher.nome = "Valdano";
        teacher.rg = 887362173;
        
        Professor teacher2 = new Professor (); //objeto2
        teacher2.cpf = "045.543.663.56";
        teacher2.matricula = "55KHJD";
        teacher2.nome = "Tatiana";
        teacher2.rg = 42355;
        
        teacher.imprimirInformacoes();
        
        System.out.println("");
        
        teacher.imprimirInformacoes();
        
        teacher2.imprimirInformacoes();
        
        
        
   
       
    }
    
}
