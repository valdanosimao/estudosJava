package modificadorStatic;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		//Ao colocar o modificador Static, não preciso instanciar um objeto
				
		MinhaCalculadora.soma(4, 7);	
		MinhaCalculadora.somar(4, 6, 6);
		MinhaCalculadora.somando(3, 5);		

	}

}
