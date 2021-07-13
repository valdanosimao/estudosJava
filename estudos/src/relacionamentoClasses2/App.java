package relacionamentoClasses2;

public class App {

	public static void main(String[] args) {


		Pessoa pessoa = new Pessoa("Valdano", "Masculino" , 34 );	
		
		Endereco end = new Endereco("Rua da igreja", "Boa Viagem", "Recife", 233, 5102130);		
		
		Carro car = new Carro("Fiat" ,"Laranja", 2007);		
		
		pessoa.setCar(car);	
				
		System.out.println("=================================");

		pessoa.setEnd(end);		
		System.out.println(pessoa.printPessoa());
		

	}

}
