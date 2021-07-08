package arraysMatrizes;

public class Matrizes {

	public static void main(String[] args) {
		
		//matriz é um vetor de vetores ou seja um array de arrays
		
		double [][] notasAluno = new double [3][4]; //instanciando objeto
		
		notasAluno [0][0] = 10;
		notasAluno [0][1] = 6.8;
		notasAluno [0][2] = 3.7;
		notasAluno [0][3] = 8.7;
		
		notasAluno [1][0] = 5.8;
		notasAluno [1][1] = 4.7;
		notasAluno [1][2] = 9.7;
		notasAluno [1][3] = 7.7;
		
		notasAluno [2][0] = 5.8;
		notasAluno [2][1] = 4.7;
		notasAluno [2][2] = 9.7;
		notasAluno [2][3] = 7.7;
		
		double mediaAluno0 = (notasAluno[0][0] + notasAluno[0][1] + notasAluno [0][2] + notasAluno [0][3] / 4);
		double mediaAluno1 = (notasAluno[1][0] + notasAluno[1][1] + notasAluno [1][2] + notasAluno [1][3] / 4);
		double mediaAluno2 = (notasAluno[2][0] + notasAluno[2][1] + notasAluno [2][2] + notasAluno [2][3] / 4);
		
		
		
		
		System.out.printf("A média do aluno '01' foi de: %.2f \n", mediaAluno0);
		
		System.out.printf("A média do aluno '02' foi de: %.2f \n" , mediaAluno1);
		
		System.out.printf("A média do aluno '03' foi de: %.2f \n" , mediaAluno2);	
		
		
		for (int i = 0; i<notasAluno.length;i++) {
			//System.out.println(notasAluno[i] + " ");
			for(int j=0; j<notasAluno[i].length; j++)
			System.out.print(notasAluno[i][j] + " ");
		}
		
		//OUTRA FORMA DE VETOR E MATRIZES JÁ COM A INFORMAÇÃO DAS NOTAS

		double [] notasAluno1= {7,8,9,10}; 
		double [][] notasAluno2 = {{7,8,9,10},{10,9,8,7}};
		
		
		System.out.printf("%s %s" ,notasAluno1,notasAluno2);
		
	}

}
