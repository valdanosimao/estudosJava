package polimorfismo2;

public class RepositorioMemoria implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando na memória");
		
	}
}
