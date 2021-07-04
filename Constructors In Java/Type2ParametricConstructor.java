package constructersInJava;

class Vehicle{
	int Wheels, HeadLights;
	String Color;
	
	Vehicle(){
	// Default constructor required to define as we manually defined others therefore we cant be able to return to default constructor
	// Therefore we defined it manual
	}
	Vehicle(int Wheels){
		this.Wheels = Wheels;
		HeadLights = 2;
	}
	
	Vehicle(int Wheels, String Color){
		this.Wheels = Wheels;
		this.Color = Color;
		HeadLights = 2;
	}
}
public class Type2ParametricConstructor {

	public static void main(String[] args) {
		Vehicle Car = new Vehicle (4);
		System.out.println("Car has " + Car.Wheels + " Wheels and " + Car.HeadLights + " Head-Lights.");
		
		Vehicle Motercycle = new Vehicle (2, "Black");
		System.out.println("Moter-Cycle has "+ Motercycle.Wheels + " Wheels and " + Motercycle.HeadLights + " Head-Lights, also it is " + Motercycle.Color + " Colored");

	}

}
