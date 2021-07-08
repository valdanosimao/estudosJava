package getterSetter;

public class AppCarro {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		car.setMarca("Fiat");
		car.setModelo("Uno");
		car.setNumPassageiro(5);
		car.setCapCombustivel(20.6);
		car.setConsCombustivel(3.8);
		
		System.out.println(car.getMarca());
		System.out.println(car.getModelo());
		System.out.println(car.getNumPassageiro());
		System.out.println(car.getCapCombustivel());
		System.out.println(car.getConsCombustivel());		
		
		
	}

}
