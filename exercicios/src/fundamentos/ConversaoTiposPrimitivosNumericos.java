package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; //impl�cita
		System.out.println(a);
		
		float b = (float) 1.0; //expl�cita (Cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //expl�cita (Cast)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
