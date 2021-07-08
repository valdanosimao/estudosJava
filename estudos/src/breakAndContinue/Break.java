
package breakAndContinue;

public class Break {

   
    public static void main(String[] args) {
      
        double valorTotal = 30000;
        for(int parcela = 1; parcela < valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("parcela " + parcela + " R$ " + valorParcela);
            }else{
                System.out.println("Saindo do Laço");
                break;
            }
            System.out.println("Fora do Laço");            
        } 
        
    }
    
}
