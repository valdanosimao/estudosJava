package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlee {

	public static void main(String[] args) {
	
		System.out.println(Locale.getDefault());//padrão do sistema operacional
		ResourceBundle bundle =	ResourceBundle.getBundle("message",new Locale( "pt", "PT"));
		System.out.println(bundle.getString("oi"));
		System.out.println(bundle.getString("boa noite"));
		
		bundle = ResourceBundle.getBundle("message", new Locale( "en", "US"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
	
	}

}
