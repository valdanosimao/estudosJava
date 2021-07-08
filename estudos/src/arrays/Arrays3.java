package arrays;

public class Arrays3 {

    public static void main(String[] args) {

        //Array int
        int[] numeros2 = {1, 2, 3};
        for (int aux : numeros2) {
            System.out.println(aux);
        }
        //Array String
        String[] nomes = new String[2];

        nomes[0] = "Valdano";
        nomes[1] = "Simão";
        for (String aux : nomes) {
            System.out.println(aux);
        }

    }

}
