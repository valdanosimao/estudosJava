package metodos.metodo;

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
        
        public void mostrarStatus(String nome1, int idade, double salario){
                System.out.println("Seu nome é: " + nome1);
                System.out.println("Sua idade é: " + idade);
                System.out.println("Seu salário é: R$" + salario);
        }

}
