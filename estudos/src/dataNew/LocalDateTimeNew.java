package dataNew;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeNew {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(); //data e hora agora
		System.out.println(localDateTime);
		System.out.println(localDateTime.getHour());
		
		
		LocalDate data = LocalDate.of(2022, Month.AUGUST, 18);
		LocalDate data2 = LocalDate.parse("18-07-1987");
		LocalDate data3 = LocalDate.now();
		
		LocalTime time = LocalTime.of(9, 45, 21);


	}

}
