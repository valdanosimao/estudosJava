package construtores;

public class TesteProduto {

	public static void main(String[] args) {
		
		//objeto padr�o
		Produto p1 = new Produto();
		String nome = "Notebook";
		double preco = 5400.89;
		double desconto  = 0.2;
		
		//objeto com parametro
		Produto p2 = new Produto("Notebook", 6509.78, 0.2); 		
		
		System.out.println(p2.nome);

	}

}
