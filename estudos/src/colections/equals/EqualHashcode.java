package colections.equals;

public class EqualHashcode {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();		
		u1.nome = "Valdano";
		u1.email = "valdanosimao@gmail.com";
		
		Usuario u2 = new Usuario();		
		u2.nome = "Valdano";
		u2.email = "valdanosimao@gmail.com";
		
		System.out.println(u1 == u2); //comparando endere�o de mem�ria
		System.out.println(u1.equals(u2));
		
	}
}
