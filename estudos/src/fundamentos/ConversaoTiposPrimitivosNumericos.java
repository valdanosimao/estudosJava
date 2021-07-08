package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.0; //explícita (Cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //explícita (Cast)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
