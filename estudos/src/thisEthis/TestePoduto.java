package thisEthis;

public class TestePoduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Caneta preta";
		p1.marca = "Bic";
		p1.valor = 2.80;
				
		Produto p2 = new Produto("Caneta vermeha");
		p2.valor = 3.87;
		
		Produto p3 = new Produto ("Borracha" , "Mercur , " , 1.89);
		
		System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);
		System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);
		System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);
	}

}
