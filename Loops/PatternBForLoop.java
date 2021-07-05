package loops;

import java.util.Scanner;

public class PatternBForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
//		int number = sc.nextInt();
		
		int number = 1 ;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i; j++) {
				
				// As we know that the number is increasing continuously so we have used '++'.
				
				System.out.print(number++ + "   ");
				
				// Or we can write
				//System.out.print(number + "   ");
				// number++;
				
			}
			
			System.out.println();
			
		}
	}

}
