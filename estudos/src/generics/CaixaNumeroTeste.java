package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> CaixaA = new CaixaNumero<>();
		CaixaA.guardar(5.7);

		CaixaNumero<Integer> CaixaB = new CaixaNumero<>();
		CaixaB.guardar(7);
	}

}
