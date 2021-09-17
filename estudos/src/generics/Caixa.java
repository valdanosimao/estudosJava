package generics;

public class Caixa<A> {
	
	//foi construido um classe generica que não foi especificado
	//quando for estanciar objetos da classe, ai sim o dev especifica o tipo
	private A coisa;
	
	public void guardar(A coisa) {
		this.coisa = coisa;
	}
	
	public A abrir() {
		return coisa;
	}

	@Override
	public String toString() {
		return "Caixa [coisa=" + coisa + "]";
	}

	
}
