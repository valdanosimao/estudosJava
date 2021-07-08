
package breakAndContinue;

public class Continue {
    public static void main(String[] args) {
        int valorTotal = 30000;
        for (int parcela = valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000){
             continue;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);
            System.out.println("código consumindo memória");
        }
    }
}
