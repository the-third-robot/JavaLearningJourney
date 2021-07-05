package whileLoop;

import java.util.Scanner;

public class PalandromeNumberWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int temp = n;
		
		int reversedNumber = 0 ;
		
		while (temp > 0) {
			
			int lastDigit = temp % 10;
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			// re-initialization stem is given below
			temp /= 10;
		}
		
		if (reversedNumber == n) {
			
			System.out.println("The number " + n + " is a Palandrome Number.");
		} else {
			
			System.out.println("The number you have entered is not a palandrome Number.");
		}
	}

}
