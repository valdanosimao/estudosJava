package thisEthis;

public class Produto {
	
	//atributos
	String nome;
	String marca;
	double valor;
	
	Produto(){
		
	}
	
	Produto(String nome){		
		//Atributo   Vari�vel
		this.nome  =  nome;
	}
	
	Produto(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
	}
	
	Produto(String nome, String marca, double valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
	
}
