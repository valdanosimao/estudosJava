package exception2;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			talvezLanceException();
		}catch (SQLException | FileNotFoundException e) { //    | >>> OU
		  e.printStackTrace();	
		}
	}
	
	private static void talvezLanceException() throws SQLException ,  FileNotFoundException{
		
	}
}
