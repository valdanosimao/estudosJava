package genericsAulas;

import java.util.List;

public class MetodosGenericos {

	public static void main(String[] args) {
		List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
		System.out.println(barcoList);
	}
	
	private static<T> List<T> criarArrayComUmObjeto(T t){
		return List.of(t);
	}
}
