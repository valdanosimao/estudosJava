package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		
		String s = "Bom dia X "; 
		s = s.toUpperCase();		// letra Mai�scula	
		s.replace("X", "Senhora");	// Substitui
		s = s.concat("!!!!"); 		//concatena
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X "
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!!!");
		System.out.println(y);
		
		//Tipos primitivos n�o tem o operador "."
		

	}

}
