package exception;

public class ExceptionAula {

	public static void main(String[] args) {
		
		try {
			int [] vetor = new int [4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
	}

}
