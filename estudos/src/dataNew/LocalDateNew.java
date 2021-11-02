package dataNew;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateNew {
public static void main(String[] args) {
	
	//local date � uma classe imutavel, n�o poder ter new
	LocalDate date = LocalDate.of(2022,Month.OCTOBER,26);
	LocalDate agora = LocalDate.now(); //data de agora
	

	System.out.println(date.getYear());//ano
	System.out.println(date.getMonth());//m�s
	System.out.println(date.isLeapYear());//caso true � um ano bisiesto, caso false, n�o �
	System.out.println(date);
	System.out.println(agora);
	
}
}
