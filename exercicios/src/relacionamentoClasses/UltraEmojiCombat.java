package relacionamentoClasses;

public class UltraEmojiCombat {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Valdano", "Brasil", 34, 1.76, 82.0, 11, 2, 1);
		l[1] = new Lutador("Krool", "França", 45, 1.68, 83.0, 3, 4, 1);
		l[2] = new Lutador("João", "Portugal", 28, 1.75, 62.0, 9, 2, 1);
		l[3] = new Lutador("Pedro", "Polônia", 33, 1.77, 92.0, 10, 1, 0);
		l[4] = new Lutador("Ricardo", "Inglaterra", 37, 1.73, 55.0, 2, 0, 0);
		l[5] = new Lutador("Lucas", "Alemanhã", 34, 1.77, 59.0, 12, 5, 3);

		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
	}

}
