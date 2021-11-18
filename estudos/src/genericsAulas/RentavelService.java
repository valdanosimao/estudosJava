package genericsAulas;
import java.util.List;


public class RentavelService <T>{
	
	private List<T> objetosDisponiveis;
	
	
	public RentavelService(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}
	
	public T buscarObjetosDisponivel() {
		System.out.println("Buscando objeto disponivel...");
		T t = objetosDisponiveis.remove(0);
		System.out.println("Alugando objeto: " + t);
		System.out.println("Objetos disponeis para alugar:");
		System.out.println(objetosDisponiveis);
		return t;
	}
	
	
	public void retornaObjetoAlugado(T t) {
		System.out.println("Devolvendo Objeto..." + t);
		objetosDisponiveis.add(t);		
		System.out.println("Objetos disponeis para alugar:");
		System.out.println(objetosDisponiveis);
		
	}
	
}
