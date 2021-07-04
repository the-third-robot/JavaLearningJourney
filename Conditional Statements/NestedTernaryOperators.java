package conditionalStaatements;

import java.util.Scanner;

public class NestedTernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int result = 0;
		
		result = a > b ? a>c?a:c : b>c?b:c;
		
		System.out.println(result + " is the greatest number of all the three numbers.");
		
	}

}
