package polimorfismo2;

public class RepositorioTeste {

	public static void main(String[] args) {
	
		// usando uma interface generica, assim posso usar em vários objetos
		//modelo muito usando na colections
		Repositorio repositorio = new RepositorioBancoDeDados();
//		Repositorio memoria = new RepositorioMemoria();
//		Repositorio arquivo = new RepositorioArquivo();
		
		repositorio.salvar();
//		memoria.salvar();
//		arquivo.salvar();

	}

}
