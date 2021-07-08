package classe;

public class ProdutoTeste {

	public static void main(String[] args) {		
		
		
		Produto p1 = new Produto(); //instância 
		
		p1.nome = "Notebook"; //membros
		p1.preco = 4356.89;
		p1.desconto = 0.25;		
		
		
		var p2 = new Produto(); //instância 
		
		p2.nome = "Caneta Preta"; //membros
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media de carrinho = R$%.2f." , mediaCarrinho);
		
	}
}
