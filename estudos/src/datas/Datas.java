package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Datas {

	public static void main(String[] args) {
		
		//Representa uma data: 06/08/2021
		LocalDate ldNow = LocalDate.now();
		//tbm tem um ENUM para representar o mês
		//ex: Month.AUGUST	
		LocalDate ld = LocalDate.of(1987, 7, 18);	
		System.out.println("LocalDate = "+ldNow);
		System.out.println("LocalDate.of = "+ld);
		//System.out.println("Soma mais + duas semanas = "+ld.plusWeeks(2));//soma com duas semanas
		//System.out.println("Soma menos - duas semanas = "+ld.minusWeeks(2));
		//Representa uma hora e milisegundos: 11:40:00 23242132
		LocalTime ltNow = LocalTime.now();
		LocalTime lt = LocalTime.of(15, 56);
		System.out.println("LocalTime = "+ltNow);
		System.out.println("LocalTime.of = "+lt);		
		
		//Representa data+hora+milisegundos: 06/08/2021 11:40:00
		LocalDateTime ldtNow = LocalDateTime.now();
		LocalDateTime ltd = LocalDateTime.of(1987, Month.JULY, 18, 16, 25);
		//conbinação de localDate e localTime já exitente
		//LocalDateTime ltd =LocalDateTime.of(ld,lt); <<<<<<
		
		System.out.println("LocalDateTime = "+ldtNow);
		System.out.println("LocalDateTime.of = "+ltd);
		
		//Representa data+hora+milisegundos: porém no GMT/UTC
		Instant iNow = Instant.now();
		System.out.println(iNow);
		
		//Representa data+hora+milisegundos + informações GMT america/SP
		ZonedDateTime zdNow = ZonedDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(ltd, ZoneId.from(zdNow));
		System.out.println(zdNow);
		System.out.println(zdt);
		
		
		
	}

}
