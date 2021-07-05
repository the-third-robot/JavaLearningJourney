package whileLoop;

import java.util.Scanner;


public class NumberOfDigitsWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		// Math.log10 () will always return a ouble value and we have to convert it to integer through manual type-casting.
		
		int numberOfDigit = (int) Math.log10(n) + 1;
		
		System.out.println("The number of digits in the given number " + n + " is equal to " + numberOfDigit);
	
	}

}
