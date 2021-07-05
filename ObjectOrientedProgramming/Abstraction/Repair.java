package oops.abstractipon;

public class Repair {
	
//	public static void repair(Audi car) {
//		System.out.println( "Audi has Repaired successfuly. Please pay the bills.");
//	}
//	
//	public static void repair(WaganR car) {
//		System.out.println("WaganR has Repaired successfuly. Please pay the bills.");
//	}
//	
// In the above program we needed to create two overloaded methods to print the same statement for both cars to reduce this work we can use Abstraction class. 
	
	public static void repair(Car car) {
		System.out.println("Car has been Repaired successfuly. Please pay the bills.");
	}
	
	public static void testing (Car car) {
		System.out.println("Car is tested successfully. Thanks for using our servise.");
	}
	public static void main(String[] args) {
		
		Audi Audi = new Audi();
		WaganR WaganR = new WaganR();
		
		System.out.println("Problems of My WaganR: ");
		WaganR.accelerating ();
		WaganR.breaking();
		
		repair(WaganR);
		WaganR.satisfied();
		System.out.println("Problems of My Audi: ");
		Audi.accelerating ();
	
		
		repair(Audi);
		Audi.satisfied();

	}

}
