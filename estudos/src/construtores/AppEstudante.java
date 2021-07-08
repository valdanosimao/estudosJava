
package construtores;

public class AppEstudante {
    public static void main(String[] args) {
        Estudante est = new Estudante("2123", "Valdano", new double[]{5,7,9},"22/02/2021");
        est.imprime();
    }
}
