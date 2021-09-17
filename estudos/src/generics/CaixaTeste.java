package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.abrir();
		caixaA.guardar("Segredo");	
		System.out.println(caixaA);
		
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.abrir();
		caixaB.guardar(3.5);		
		System.out.println(caixaB);
	}

}
