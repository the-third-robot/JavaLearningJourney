package loops;

import java.util.Scanner;

public class SeriesSum2ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		float Summation = 0;
		
		for (float i = 1; i <= n; i++) {
			
			if (i % 2 == 0) {
				
				Summation -= 1/i;
				
			} else {
				
				Summation += 1/i;
			}
			
		}
		
		System.out.println("Summation = " + Summation);
	}

}
