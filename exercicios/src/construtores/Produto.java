package construtores;

public class Produto {
	
	
	//atributos
	String nome;
	double preco;
	double desconto;
	
	
	//construtor padr�o
	Produto (){
		
	}	
	
	//construtor com parametro
	Produto (String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

}
