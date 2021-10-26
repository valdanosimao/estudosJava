package datas2;

import java.util.Calendar;
import java.util.Date;

public class Calendar2 {
	
	public static void main(String[] args) {
		
		//CALENDAR É UMA CLASSE ABSTRATA, E NÃO PODE SER INSTÂNCIADA		
		Calendar c = Calendar.getInstance();
		if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingo");
		}
		
		Date data = c.getTime();
		System.out.println(data);
	}

}
