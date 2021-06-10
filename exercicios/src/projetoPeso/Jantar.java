package projetoPeso;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz",1.0);
		Comida c2 = new Comida("Feijão",1.0);
		
		Pessoa p = new Pessoa("João",70.2);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}

}
