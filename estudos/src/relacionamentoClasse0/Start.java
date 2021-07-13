package relacionamentoClasse0;

public class Start {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Valdano";
		pessoa.idade = 34;
		
		Carro car =  new Carro();
		car.nome = "Gol";
		car.ano = 2004;
		
		pessoa.car = car;

		pessoa.car.andar();

	}

}
