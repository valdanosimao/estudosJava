package arraysMatrizes;

public class ManipulandoMatrizes {

	public static void main(String[] args) {
	
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
		
		
		notasAluno[0][0] = 8; //manupilação
		
		double mediaAluno0 = (notasAluno[0][0] + notasAluno[0][1] + notasAluno [0][2] + notasAluno [0][3] / 4);
		double mediaAluno1 = (notasAluno[1][0] + notasAluno[1][1] + notasAluno [1][2] + notasAluno [1][3] / 4);
		double mediaAluno2 = (notasAluno[2][0] + notasAluno[2][1] + notasAluno [2][2] + notasAluno [2][3] / 4);
		
		
		
		
		System.out.printf("A média do aluno '01' foi de: %.2f \n", mediaAluno0);
		
		System.out.printf("A média do aluno '02' foi de: %.2f \n" , mediaAluno1);
		
		System.out.printf("A média do aluno '03' foi de: %.2f \n" , mediaAluno2);	
		
		
		
	
		
		
		
		
	}

}
