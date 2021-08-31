package datas;

import java.time.Duration;

public class DurationAula {

	public static void main(String[] args) {
		
		//contagem de horas PT24H
		Duration offDays = Duration.ofDays(1);
		System.out.println(offDays);
		
		//contagem de horas PT2H
		Duration oddHour = Duration.ofHours(2);
		System.out.println(oddHour);
		
		//contagem de minutos PT8H20M
		Duration minutes = Duration.ofMinutes(500);
		System.out.println(minutes);
		
		

	}

}
