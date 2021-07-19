package interfacee;

public class Teste {

	public static void main(String[] args) {
	
		Carro car = new Carro();
		Moto moto = new Moto();
		
		car.statusFacricado();
		car.PRECO();
		
		System.out.println("==================");
		
		moto.statusFacricado();
		moto.PRECO();
		

	}

}
