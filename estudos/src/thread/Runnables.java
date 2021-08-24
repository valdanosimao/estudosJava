package thread;

public class Runnables {

	public static void main(String[] args) {		

		Thread email = new Thread(thread1);
		email.start();	
		
		
		
		Thread relatorio = new Thread(thread2);
		relatorio.start();
	

	}	
	
	
	
	//*********************INTERFACE RUNNABLE 1****************************

	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println("Enviando E-mails...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();				
			}
			
			}
			System.out.println("E-mails enviandos com sucesso!");
			
			
		}
	};
	
	//*********************INTERFACE RUNNABLE 2****************************
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int i = 0; i < 10; i++) {
				System.out.println("Enviando Relatórios...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();				
			}
			
			}
			System.out.println("Relatórios enviandos com sucesso!");
			
		}
	};
	
	
}
