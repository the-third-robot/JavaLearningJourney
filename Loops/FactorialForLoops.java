package loops;

import java.util.Scanner;

public class FactorialForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
//		int n = sc.nextInt();
//		
//		int Factorial = n;
//		
//		for (int i = n-1 ; i >= 1; i--) {
//			
//			Factorial = Factorial * i;
//		}
//		Sirs view
		int n = sc.nextInt();
		
		int Factorial = 1;
		
		for (int i = n ; i >= 1; i--) {
			
			Factorial = Factorial * i;
		}
		
		System.out.println(Factorial);
	}

}
