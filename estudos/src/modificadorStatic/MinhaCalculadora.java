package modificadorStatic;

public class  MinhaCalculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double somando(double num1,double num2) {
		return num1 + num2;
	}

	public static int somar(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int somei(int[] vetorInteiro) {
		int total = 0;
		for(int i =0; i<vetorInteiro.length; i++) {
			total += vetorInteiro[i];
		}
		return total;
		
	}
	
}
		
	
	
