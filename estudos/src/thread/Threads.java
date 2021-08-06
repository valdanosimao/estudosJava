package thread;

public class Threads {

	public static void main(String[] args) {
		
		
		new Thread() { //processa paralelamente no background			
			
			public void run() { //aqui é o código de rotina 
				
				for(int pos = 0; pos < 10; pos++) {
					
					System.out.println("Downloading....");
										
					try { // O sleep é obrigatoriamente envolvida pelo try/catch
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
				
			}			
			
		}.start();
	
	}

}
