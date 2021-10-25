package polimorfismo2;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no Arquivo");
		
	}
}
