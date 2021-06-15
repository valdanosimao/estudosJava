package arrays;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		
		double[] notaAlunoA = new double [4];
		notaAlunoA [0] = 7.0;
		notaAlunoA [1] = 8;
		notaAlunoA [2] = 9.8;
		notaAlunoA [3] = 9.8;
		
		double total = 0;
		for(int i = 0; i < notaAlunoA.length; i++ ) {
			total += notaAlunoA[i];
		}
		
		System.out.println(total / 3);
		
		//******************************************
		
		double [] notaAlunoB = {6.7, 5.7,6.9,3.8};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notaAlunoB.length);
		
	}

}
