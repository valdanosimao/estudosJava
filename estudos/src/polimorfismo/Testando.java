package polimorfismo;

public class Testando {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Valdano", 2500.89, 2000);
		Vendedor v = new Vendedor("Tatiana", 1300, 2000);
		
		RelatorioPagamento pagto = new RelatorioPagamento();
		
		pagto.relatorioPagamentoGerente(g);
		pagto.relatorioPagamentoVendedor(v);
		
		
		
		
		
		//polimorfismo
		Produto produto = new Computador("Nitro 5" , 5454.00);
		
		produto.setNome("Notebook Gamer");
		produto.setPreco(5500.00);
	
	}

}
