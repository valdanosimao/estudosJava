
package sobrecargaOverload;

//clase
public class Funcionario {
    
    //atributos
    private String nome;
    private String cpf;
    private double salario;
    private String rg;
   
   
    //métodos
    public void status(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;        
    }  
    
    //método de sobre carga / overload
    public void status(String nome, String cpf, double salario,String rg){
        status(nome,cpf,salario);//usando método existente e seus paranmetros
        this.rg = rg;       
    }      
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }    
    
    //métodos especiais
     public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }   
    
    public String getCpf(){
        return this.cpf;
    }
        
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return this.salario;
    }
        
    public void setSalario(double salario){
        this.salario = salario;
    }    
    
    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
}
