package whileLoop;

import java.util.Scanner;

public class Example1WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int temp = n;
		
		while (temp > 0) {
			
			int lastDigit = temp % 10;
			// temp /= 10
			temp = temp / 10;
			// sum += lastDigit
			sum = sum + lastDigit;
			
			// to know the working process
			
			System.out.println(lastDigit + " " + temp + " "+ sum);
			
		}
		
		System.out.println("The sum of the digits of the number " +n+  " is equal to "+ sum);
	}

}
