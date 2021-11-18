package genericsAulas;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica01 {

	public static void main(String[] args) {
	
		List<Carro> carroDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Jangada")));
		
		RentavelService<Carro> rentalServiceCarro = new RentavelService<Carro>(carroDisponiveis);
		Carro carro = rentalServiceCarro.buscarObjetosDisponivel();
		System.out.println("Usando o carro por um mês...");
		rentalServiceCarro.retornaObjetoAlugado(carro);
		
		System.out.println("----------------------");
		
		RentavelService<Barco> rentalServiceBarco = new RentavelService<Barco>(barcoDisponiveis);
		Barco barco = rentalServiceBarco.buscarObjetosDisponivel();
		System.out.println("Usando o carro por um mês...");
		rentalServiceBarco.retornaObjetoAlugado(barco);
	}

}
