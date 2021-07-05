package oops.Generics;

//public class Pairs  {
// Standard class is given below but what if we want a class in which we want to give the data types at the run time
// i.e.  when we are going to create an object of it.
//	String x;
//	int y;
//	
//	public void Pair (String x, int y) {
//		this.x = x;
//		this.y = y;
				
//	}
public class Pairs <X,Y>{
	X a;
	Y b;
	
	public Pairs (X a, Y b) {
		this.a = a;
		this.b = b;
		System.out.println("I am " + a + " and I got " + b);
	}
}
