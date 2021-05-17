package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;  //Wrapper
		System.out.println(num1.toString().length()); //converteu Inteiro para String 
		// langth serve para saber a quantidade de caracteres
		//lenght só funciona em Strings
		
		int num2 = 100000;  //tipo primitivo
		System.out.println(Integer.toString(num2)); //converteu Inteiro para String 		

		

	}

}
