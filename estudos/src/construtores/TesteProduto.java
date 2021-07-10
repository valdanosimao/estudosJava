package construtores;

public class TesteProduto {

	public static void main(String[] args) {
		
		//objeto padrão
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 5400.89;
		p1.desconto  = 0.2;
		
		
		
		//objeto com parametro
		Produto p2 = new Produto("Notebook", 6509.78, 0.2); 		
		
		System.out.println(p2.nome);

	}

}
