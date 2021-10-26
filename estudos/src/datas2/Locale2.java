package datas2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Locale2 {

	public static void main(String[] args) {
	
		Locale localeItaly = new Locale("it","IT");
		Locale localeCH = new Locale("it","CH");
		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
		System.out.println("Italia " + df1.format(calendar.getTime()));
		System.out.println("Suiça " + df2.format(calendar.getTime()));
	}

}
