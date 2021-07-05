package operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int a = sc.nextInt();
	
	int b = sc.nextInt();
	
	int c = a+b;
	
	int d = a*b;
	
//	float e = a/b; will always give the value like 1.0 as both a and b are integers gives an integer value and then converted 
//  give float value. To get the exact value of division we have to define it as float shown below.
	
	float e = (float) a /(float)  b;
	
	int f = a * a + b * b + 2 * a * b;
	
	int g = a % b;
	
	int h = ++a;
	
	int i = --b;
	
	System.out.println("c = "+c);
	
	System.out.println("d = "+d);
	
	System.out.println("e = "+e);
	
	System.out.println("(a + b)^2 = "+f);
	
	System.out.println("g = "+g);
	
	System.out.println("h = "+h);
	
	System.out.println("i = "+i);
	
	}

}
