package loops;

import java.util.Scanner;

public class Pattern1ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
	for (int j = 1; j <= n; j++) {	
		
			for (int i = 1; i <= n; i++) {
			// printing in line
			System.out.print("* ");
			
			}
			// printing in next line
			System.out.println();
		}
	}

}
