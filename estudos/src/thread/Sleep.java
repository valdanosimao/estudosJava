package thread;

public class Sleep {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int pos = 0; pos < 10 ; pos++) {
			Thread.sleep(1000);
			System.out.println("Baixando arquivos...");
		}
		
	}

}
