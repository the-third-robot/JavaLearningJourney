package loops;

import java.util.Scanner;

public class Pattern3ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i - 1; j++) {
				
				// I had given two spaces and run the loop for i - 1 times so that I will get 2(i-1) spaces for every i th row.
				
				System.out.print("  ");
			}
			
			for (int j = 1; j <= n - i + 1; j++ ) {
			
			
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}

}
