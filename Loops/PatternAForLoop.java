package loops;

import java.util.Scanner;

public class PatternAForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n =  sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++) {
				
				// I have given three spaces after the star in place of two spaces to get more accurate pattern.
				
				System.out.print("*   ");
			}
			
			System.out.println();
		}
	}

}
