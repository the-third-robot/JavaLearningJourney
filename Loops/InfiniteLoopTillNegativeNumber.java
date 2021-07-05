package loops;

import java.util.Scanner;

public class InfiniteLoopTillNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		for ( ; ; ) {
			
			int n = sc.nextInt();
			
			if (n < 0) {
	
				System.out.println("You entered a negative number so you lose!");
				
				break;
			}
			
			
		}
	}

}
