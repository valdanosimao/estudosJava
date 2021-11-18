package genericsAulas;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
	
		List<Cachorro> cachorros = new ArrayList<>();
		List<Gato> gatos = new ArrayList<>(); 
		List<Animal> animais = new ArrayList<>();
		printConsulta(gatos);
		printConsulta(cachorros);		
		printConsultaAnimal(animais);
	}
	
	public static void printConsulta(List<? extends Animal> animais) {
		for(Animal animal: animais) {
		   animal.consulta();
		}		
	
   }
	
	public static void printConsultaAnimal(List<? super Animal> animais) {
		
		animais.add(new Cachorro());
		animais.add(new Gato());
	}	
	
}
