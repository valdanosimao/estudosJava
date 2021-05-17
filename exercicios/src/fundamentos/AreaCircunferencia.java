package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; 
		//com o final antes do tipo, ela fica constante(não muda), constante tem que usar letra Maíscula
		
		double area = PI * raio * raio;		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2");

	}

}
