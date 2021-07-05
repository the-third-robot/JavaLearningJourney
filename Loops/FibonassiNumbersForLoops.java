package loops;

import java.util.Scanner;

public class FibonassiNumbersForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		
		int b = 1;
		// ln stands for new line which is not necessary here.
		
		System.out.print(a + " ");
		
		System.out.print(b + " ");
		// As we have taken two numbers already therefore the loop will continue for "n-2" times to get the series therefore,
		
		for (int i = 0; i < n - 2; i++) {
			
			// Now we have to take the third number c such that it will be the sum of a and b therefore,
			
			int c = a + b;
			
			System.out.print(c + " ");
			
			// Now we have to replace a by b and b by c to continue the number series therefore,
			
			a = b;
			
			b = c;
			
		}
	}

}
