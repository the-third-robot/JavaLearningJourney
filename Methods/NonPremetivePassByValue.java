package methods;

class Dog {
	int legs;	
}

public class NonPremetivePassByValue {

	public static void main(String[] args) {
		Dog Dog1 = new Dog();
		Dog1.legs = 4;
		Dog Dog2 = new Dog();
		Dog2.legs = 5;

		swap (Dog1, Dog2);
		System.out.println(Dog1.legs + " " + Dog2.legs);
// Due to change of reference of the Dog1 and Dog2 the values of legs remains same even after swapping.		

		Dog Harry = new Dog();
		Harry.legs = 4;
		
		changelegs(Harry);
		System.out.println("Harry is a Mutated Dog havint " + Harry.legs + " legs");
// Now here the value is changed as both Harry and 'a' will have same reference and hence the value stored will also change in Harry.
	}

	static void changelegs (Dog a) {
		a.legs = 6;
			}
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
		
	}
}
