package arrays;

public class Treino {

	public static void main(String[] args) {
	
		double[] notaAlunoA = new double [4];
		notaAlunoA [0] = 7.0;
		notaAlunoA [1] = 8;
		notaAlunoA [2] = 9.8;
		notaAlunoA [3] = 9.8;

		for(double notasA: notaAlunoA) {
			System.out.println(notasA);
		}
		
		System.out.println();
		
		//******************************************
		double [] notaAlunoB = {6.7, 5.7,6.9,3.8};
		
		for(double notaB: notaAlunoB) {
			System.out.println(notaB);
		}
	}

}
