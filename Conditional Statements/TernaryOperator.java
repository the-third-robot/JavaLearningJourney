package conditionalStaatements;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c =  2;
				
		c = a>b ? a : b;
		
		System.out.println("The greater number is "+c);
	}

}
