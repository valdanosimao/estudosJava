package arraysMatrizes;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 31.3;
		temperaturas[5] = 33.1;
		
		
		System.out.println("O valor da temperatura do dia 1 �: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length); //saber o quantidade de arrays

		
		System.out.println("O valor do array �: " );
		
		
		for (int i = 0; i <temperaturas.length; i++){
		System.out.println("O valor da temperatudo do dia" + (i+1) + "�: " + temperaturas[i]);
		}
		
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
	}
		

}
