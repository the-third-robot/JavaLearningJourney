package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(maxOf(10,20));
		
		System.out.println(maxOf(13));
		
		System.out.println(maxOf(2.2,3.5));

	}
	
	static int maxOf (int a,int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	static int maxOf (double a,double b) {
		return (int) a + (int)b;
		
	}
	
	static int maxOf (int a) {
		return a;	
	}

}
