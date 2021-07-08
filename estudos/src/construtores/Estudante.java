
package construtores;

    //classe
public class Estudante {
    
    // Atributos
    private String matricula;
    private String nome;
    private double [] notas;
    private String dataMatricula;
    
    static{
        System.out.println("Bloco de inicialização");
    }
    
    //construtor    
    public Estudante(String matricula, String nome, double [] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    
    //sobre carga construtor
      public Estudante(String matricula, String nome, double [] notas, String dataMatricula){
        this(matricula,nome, notas);//sobre carga de construtor
        this.dataMatricula = dataMatricula;
    }    
    
    public Estudante(){
        
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.dataMatricula);
        for(double nota: notas){//imprimir arrays
            System.out.println(nota + " ");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    
    
}
