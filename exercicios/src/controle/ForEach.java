package controle;

public class ForEach {

	public static void main(String[] args) {	
		
		
		int[] nums = new int[10];
		
		nums[0] = 125;
		nums[1] = 5487;
		nums[2] = 45;
		nums[3] = 457;
		nums[4] = 887;
		nums[5] = 1;
		nums[6] = 4087;
		nums[7] = 1287;
		nums[8] = 5456;
		nums[9] = 789841;		
		
		
		for (int item : nums) {			
			System.out.println(item);	
		}		
		
	}

}
