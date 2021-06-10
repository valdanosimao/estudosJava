package valorVsReferencia;


public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		Data d1 = new Data();
		Data d2 = d1; // atribuição por referência (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println();
		
	}

}
