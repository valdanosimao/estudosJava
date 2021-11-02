package dataNew;

import java.time.LocalDate;
import java.time.Period;

public class PeriodNew {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate nowAfterTowYers =  LocalDate.now().plusYears(2).plusDays(7);
	
	
		Period periodo = Period.between(now, nowAfterTowYers);
		System.out.println(periodo);

	}

}
