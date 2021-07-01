package heranca2;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Valdano");
		v1.setIdade(34);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Valdano");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Tatiana");
		b1.pagarMensalidade();

	}

}
