package operator;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b =sc.nextInt();
		
		// And operator
		int c =  a & b;
		
		// OR Operator
		int d = a | b;
		
		//Right Shift operator  - Bits arranges such that the number will become half than the preceding number.
		int e = a >> 3;
		
		//Left Shift operator - Numbers arranges in such a way that the number will double than the preceding number
		int f = b << 1;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
