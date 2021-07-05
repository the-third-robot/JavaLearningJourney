package methods;

public class PassByValue {

	public static void main(String[] args) {
		int a1 = 33;
		int b1 = 44;
		
// As the values are not swapped therefore we can say that the "Swap" method first make a copy of given numbers and then processes it.
// And hence the given numbers remains unchanged therefore Java is a CALL BY VALUE ALWAYS.
		swap (a1,b1);
		System.out.println(a1 + " " + b1);
		
		

	}
	static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
