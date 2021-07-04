package conditionalStaatements;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner (System.in);
		
		float a = sc.nextFloat();
		
		float b = sc.nextFloat();
		
		float c = sc.nextFloat();
		
//		if (a > b) {
//			
//			if (a > c) {
//				
//				System.out.println(a + " is the greatest number.");
//				
//			}else {
//				
//				System.out.println(c + " is the greatest number.");
//			}
//		}
//		
//		if (a < b) {
//			
//			if (b > c) {
//				
//				System.out.println(b + " is the greatest number.");
//			} else {
//				
//				System.out.println(c + " is the greatest number.");
//			}
//		}
		// Above mentioned method is traditional method which is little bit longer and the below given method reduces some work 
		//i.e little bit shorter method.
		
		int result = 0;
		if (a > b) {
			
			if (a > c) {
				
				result = (int) a;
				
			}else {
				
				result = (int) c;
			}
		}
		
		if (a < b) {
			
			if (b > c) {
				
				result = (int) b;
			} else {
				
				result = (int) c;
			}
		}
				System.out.println("The greatest number of all the numbers is " + result);
		}

}
