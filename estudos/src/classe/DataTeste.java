package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		data1.dia = "S�bado";
		data1.mes = "Julho";
		data1.ano = 2021;
		
		System.out.println("O dia � " + data1.dia + " o m�s � " + data1.mes + " e o ano " + data1.ano);
		
		
		Data data2 = new Data();
		
		data2.dia = "Domingo";
		data2.mes = "Mar�o";
		data2.ano = 2021;
		
		System.out.println("O dia � " + data2.dia + " o m�s � " + data2.mes + " e o ano " + data2.ano);
		
	}

}
