package fundamentos;


public class Wrappers {

	public static void main(String[] args) {
		
	
		
		// byte
		Byte b =100;
		Short s = 1000;
		
		//Integer i = Integer.parseInt(scan.next()); // int
		Integer i = 10000; //int
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.03F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c + "...");

	}

}
