package dataNew;

import java.time.LocalTime;

public class LocalTimeNew {

	public static void main(String[] args) {
	
		LocalTime time = LocalTime.of(23, 45 , 12);
		LocalTime timeNow = LocalTime.now();
		System.out.println(time);
		System.out.println(timeNow);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(LocalTime.MIN);//00:00
		System.out.println(LocalTime.MAX);//23:59
	}

}
