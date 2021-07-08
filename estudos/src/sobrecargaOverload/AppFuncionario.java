
package sobrecargaOverload;


public class AppFuncionario {
    
    public static void main(String[] args) {
    
        Funcionario funcionario = new Funcionario();
        funcionario.status("Valdano", "343.434.554.44", 3500.90 , "234");    
        funcionario.imprime();
            
    }
    
}
