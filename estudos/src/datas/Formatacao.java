package datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Formatacao {

	public static void main(String[] args) {
	
	//Locale.setDefault(Locale.US);
		
		
	//data Formatada e ano abreviado >> ofLocalizedDate(FormatStyle.SHORT);
	//data formatada e ano abriviado e mostrando a hora e minutos >> ofLocalizedDateTimeFormatStyle.SHORT);
	//MEDIUM >> mostra mais detalhes
	//DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);		
		

	//Padrão para impressão de data
	//Transformando o valor em um String
	LocalDateTime ldtNow = LocalDateTime.now();
	DateTimeFormatter formatPadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	String formatPadrao2 = formatPadrao.format(ldtNow);	
	System.out.println(formatPadrao2);
	
	

}

}
