package colecoes;

public class Equalss {

	public static void main(String[] args) {
		
		
		String nome = "Valdano";
		String nome2 = "Valdano";		
		System.out.println(nome == nome2);//true
		System.out.println(nome.equals(nome2));//true
		
		System.out.println();
		
		String nome3 = new String("Tati");
		String nome4 = new String("Tati");
		System.out.println(nome3 == nome4);//false
		System.out.println(nome3.equals(nome4));//true
		
		System.out.println();
		
		String nome5 = new String("Krool");
		String nome6 = "Krool";
		System.out.println(nome5 == nome6);//false
		System.out.println(nome5.equals(nome6));//true
	}
	
}
