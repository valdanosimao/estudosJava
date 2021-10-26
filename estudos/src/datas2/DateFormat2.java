package datas2;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormat2 {
	public static void main(String[] args) {
		
	//CALENDAR É UMA CLASSE ABSTRATA, E NÃO PODE SER INSTÂNCIADA
	Calendar c = Calendar.getInstance();
	//DTAEFORMAT É UMA CLASSE ABSTRATA, E NÃO PODE SER INSTÂNCIADA
	DateFormat [] df = new DateFormat[7];
	df [0] = DateFormat.getInstance();
	df [1] = DateFormat.getDateInstance();
	df [2] = DateFormat.getDateTimeInstance();
	df [3] = DateFormat.getDateInstance(DateFormat.SHORT);
	df [4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
	df [5] = DateFormat.getDateInstance(DateFormat.LONG);
	df [6] = DateFormat.getDateInstance(DateFormat.FULL);
	
	for (DateFormat dateFormat : df) {
		System.out.println(dateFormat.format(c.getTime()));
	}
	
	
	
	}
}
