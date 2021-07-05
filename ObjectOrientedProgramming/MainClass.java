package oops;


class Cat {
	boolean hasFurr;
	String color, breed;
	
	int legs, eyes;
	
	// Methods (Functions)
	
	public void walk() {
		
		System.out.println("Cat is Walking on the street.");
	}
	
	public void eat() {
		
		System.out.println("Cat is eating food.");
	}
	
	public void description () {
		
		System.out.println("My cat has "+legs+ " legs and "+eyes+" eyes.");
	}
	
}
class Dog{
	
	String Breed, Name;
	
	public void Jump() {
		
		System.out.println("My Dog " +Name+ " jumped");
	}
	
	public void Description () {
		
		System.out.println("My Dog's Name is "+ Name + " and his Breed is "+ Breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("Cat Class Starts Here ");
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat ();
		
		Cat1.walk();
		Cat2.eat();
		
		Cat1.legs = 3;
		Cat1.eyes = 2;
		
		Cat1.color = "Brown";
		Cat2.color = "Black and White";
		
		Cat2.legs = 4;
		Cat2.eyes = 2;
		
		System.out.print("Cat 1 : ");
		Cat1.description();
		System.out.print("Cat 2 : ");
		Cat2.description();
		
		
		System.out.println("Cat 1 is " + Cat1.color + " colored");
		System.out.println("Cat 2 is " + Cat2.color + " colored");
		
		
		System.out.println();
		System.out.println("Dog Class Starts Here ");
		Dog Dog1 = new Dog();
		Dog Dog2 = new Dog();
		
		Dog1.Name = "Jon";
		Dog2.Name = "Diago";
		
		Dog1.Breed = "Labradog";
		Dog2.Breed = "Germany Shepard";
		
		System.out.print("Dog 1 : ");
		Dog1.Jump();
		System.out.print("Dog 2 : ");
		Dog2.Jump();
		
		System.out.print("Dog 1 : ");
		Dog1.Description();
		System.out.print("Dog 2 : ");
		Dog2.Description();

	}

}
