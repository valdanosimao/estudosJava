package metodos;

public class Produto {
	
	//atributos
	String nome;
	double preco;
	double desconto;
	
	//m�todo 1
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	//m�todo 2
	double precoComDesconto(double descontoGerente) { //parametros
		return preco * (1 - desconto - descontoGerente);
	}

}
