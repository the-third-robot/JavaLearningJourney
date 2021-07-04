package constructersInJava;
class Cars {
// NoArgumentConstructor
	int wheels;
	Cars(){
		wheels = 4; // Initialized the variable.
	}
}
public class TypesOfConstructors {

	public static void main(String[] args) {
	
		Cars Indigo = new Cars();
		System.out.println(Indigo.wheels + " Wheels");

	}

}
