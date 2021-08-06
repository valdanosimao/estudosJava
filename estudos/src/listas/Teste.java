package listas;

public class Teste {

	public static void main(String[] args) {
		
		//Criei uma classe Contatos com os atributos, construtores e métodos
		//Criei uma classe Pessoas e dentro de pessoas informei que pessoas tem Contatos(Instânciando lista >>> List<Contatos> contato = new ArrayList<>();)
		//Em Pessoas criei os métodos e construtores já com a lista de contatos
		
		Contatos c1 = new Contatos("Av Desembargador José Neves Nº 233" ,"valdanosimao@gmail.com","345-3250");
		Contatos c2 = new Contatos("Av dando lá show Nº 88" ,"joaorecife2@gmail.com","888-88543");
		Contatos c3 = new Contatos("Av malaba kkk Neves Nº 10" ,"paulo244@gmail.com","465-350");
		Contatos c4 = new Contatos("Av jogador jose pedro Nº 35" ,"ednamariana@gmail.com","2324-4667");			
		
		
		Pessoas p1 = new Pessoas();		
		Pessoas p2 = new Pessoas();		
		Pessoas p3 = new Pessoas();		
		Pessoas p4 = new Pessoas();		
		
		//estou usando relacionamento entre objetos	
		p1.getContato().add(c1);
		p1.setNome("Valdano");
		
		p2.getContato().add(c2);
		p2.setNome("Tatiana");
		
		p3.getContato().add(c3);
		p3.setNome("Carla");
		
		p4.getContato().add(c4);
		p4.setNome("Simão");	
		
		
		System.out.println(p3.toString());
		
//		System.out.println("Localiza o objeto pelo index: " + p1.getContato().get(0));
//		System.out.println("Removendo um objeto: " + p1.getContato().remove(c1));
//		System.out.println("Tamanho de objetos na lista " + p1.getContato().size());
//		System.out.println("Verifica se contem o objeto = " + p1.getContato().contains(c2));
//		System.out.println("Verifica se está vazio = " + p1.getContato().isEmpty());
	
		
	}	
		
	
	
}
