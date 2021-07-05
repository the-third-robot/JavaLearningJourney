package loops;

import java.util.Scanner;

public class PrimeUsingForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		
		
//		for (int i = 2; i < n; i++) {
//			
//			if (n % i == 0) {
//				
//				isPrime = false;
//				
//				break;
//				
//			}
//		}
		
//As we know that if any number has a factors then it's atleast one factor lies between 1 to squrt n therefore if we don't get any factor till squrt n then it is definitly a prime number.
		
		for (int i = 2; i*i < n; i++) {
			
			if (n % i == 0) {
				
				isPrime = false;
				
				break;
				
			}
		}
		if (n < 2) isPrime = false;
	
		System.out.println("It is " + isPrime + " that the number " + n + " is a Prime Number.");
	}

}
