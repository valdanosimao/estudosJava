package stringBuilder;

public class Stringg {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		concatString(30_000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para String " + (fim - inicio) + "ms ");
		
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms ");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms ");
		
		
	}
	
	@SuppressWarnings("unused")
	private static void concatString(int tamanho) {
		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			texto += i;
		}
	}
	
	//A DIFERENÇA ENTRE STRINGBUILDER E STRINGBUFFER, É QUE A STRINGBUFFER É USADO EM MULTIPLAS THREDS
	
	@SuppressWarnings("unused")
	private static void concatStringBuilder(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
	
	
	@SuppressWarnings("unused")
	private static void concatStringBuffer(int tamanho) {
		StringBuffer sb = new StringBuffer(tamanho);
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
}
