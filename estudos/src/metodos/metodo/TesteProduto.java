package metodos.metodo;

public class TesteProduto {

	public static void main(String[] args) {
		
		//Objeto 1
		Produto p1 = new Produto(); //inst�nciei uma classe		
		p1.nome = "Notebook";
		p1.preco = 3650.00;
		p1.desconto = 0.28;
		
		//Objeto 2
		Produto p2 = new Produto(); //inst�nciei uma classe	
		p2.nome = "Pc Gamer";
		p2.preco = 4570.00;
		p2.desconto = 0.15;		
		
              
		
			System.out.printf("O valor do Notebook � R$%.2f\n" , p1.preco);
				System.out.printf("O desconto do vendedor foi de %.2f\n " , p1.desconto);
					System.out.printf("O valot total do produto � R$ %.2f\n\n" , p1.precoComDesconto());
					
					
			System.out.printf("O valor do PC Gamer � R$%.2f\n" , p2.preco);
				System.out.printf("O desconto do vendedor foi de %.2f\n " , p2.desconto);
					System.out.printf("O valot total do produto � R$ %.2f\n\n" , p2.precoComDesconto(0.1));			
							
		
			
			

	}

}
