package thread;

public class ThreadConcorrente {

	public static void main(String[] args) {
		
		new Thread() {
			
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
			
		}.start();
		
		//*******************************DIVIS�O**************************************
		
		new Thread() {
			
			public void run() {
				
				for(int i = 0; i < 10; i++) {
					System.out.println("Enviando Relat�rios...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();				
				}
				
				}
				System.out.println("Relat�rios enviandos com sucesso!");
			}
			
		}.start();

	}

}
