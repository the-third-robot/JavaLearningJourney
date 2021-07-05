package methods;

public class Introduction {

	public static void main(String[] args) {
		int FirstNumber = 25;
		int SecondNumber = 65;
		
		int result = maxOf(FirstNumber,SecondNumber);
		System.out.println(result);

		int c = maxOf (100,200);
		System.out.println(c);
		
		System.out.println(maxOf(2,4));
		
		maxOfex(20,32);
		System.out.println(maxOfex(33,21));
		// In the above line firstly the method will be executed ant the will print the returned int value hence will give two lined output.
	
		SayHi();
		
		SayHi();
	
	}
	
	static int maxOf(int a, int b) {		
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	// The method written below will return the value as well as will execute the code inside it i.e. prints the values.
		static int maxOfex(int a, int b) {		
			if (a > b) {
				System.out.println("The greatest number is " + a);
				return a;
				
			}else {
				System.out.println("The greatest number is " + b);
				return b;
			}
	}
		
		static void SayHi() {
			
			System.out.println("Hi all.");
			System.out.println("Goodmorning and Welcom to the Company.");
		}

}
