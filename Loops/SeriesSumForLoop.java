package loops;

import java.util.Scanner;

public class SeriesSumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		float sum = 0;
		
		for (float i = 1; i <= n; i++) {
			
//			sum = sum + 1/i;
			
			sum += 1/i;
			
		}
				

		System.out.println("Summation = " + sum);
	}

}
