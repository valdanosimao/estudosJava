package datas2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat2 {
	
	public static void main(String[] args) {
		String pattern = "yyyy.MM.dd G 'at' HH.mm:ss z";
		SimpleDateFormat sdf =  new SimpleDateFormat(pattern);
		sdf.format(new Date());
		
		System.out.println(sdf.format(new Date()));
	}

}
