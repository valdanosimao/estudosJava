package arraysMatrizes;

public class Treinos {

	public static void main(String[] args) {
		
		
		String [] carros = new String [5];
		
		carros[0] = "Fusca";
		carros[1] = "Kombi";	
		carros[2] = "Uno";	
		carros[3] = "Chevete";	
		carros[4] = "Brasília";	
		
		System.out.println(carros[4]);
		
		
		System.out.println("---------------------------------------------------");		
		
		
		String [] carros2 = {"Fusca","Kombi","Uno","Chevete","Brasilia"};
		
		//carros2[3] = "Doblô"; //manipulação
		//System.out.println(carros2[3]);
		
		for (int i = 0; i < carros2.length; i++) {
			System.out.println(carros2[i]);
		}
		
		
		
		
		}

	}


