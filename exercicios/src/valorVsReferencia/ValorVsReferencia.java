package valorVsReferencia;


public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		Data d1 = new Data();
		Data d2 = d1; // atribui��o por refer�ncia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println();
		
	}

}
