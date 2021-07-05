package loops;

import java.util.Scanner;

public class PatternCForLoopMethode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int row = 2 * n - 1;
		
		for (int i = 1; i <= row; i++) {
			
			if (i < n) {
				
				for (int j = 1; j <= i; j++) {
					
					System.out.print(i + "*");
				}
			} else {
				
				for (int j = n; j <= row - i + 1; j--) {
					
					System.out.print(i + "*");
				}
			}
			
			System.out.println();
		}
	}

}
