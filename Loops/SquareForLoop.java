package loops;

import java.util.Scanner;

public class SquareForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
//		int Solution = x;
//		
//		for (int i = 1; i < y; i++) {
//			
//			Solution = Solution*x;
		
		int Solution = 1;
		
		for (int i = 0; i < y; i++) {
			
			Solution = Solution*x;
			
		}
		
	System.out.println(Solution);
	}

}
