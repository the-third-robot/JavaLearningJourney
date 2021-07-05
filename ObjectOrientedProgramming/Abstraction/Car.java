package oops.abstractipon;

public abstract class Car {

	public abstract void accelerating();
	
	public abstract void breaking();

// As we all know that there is no need to create any object of Car class hence we can use the car class as abstract class.
// We can create a non-abstract method of an abstract class.
	
	public void satisfied () {
		System.out.println("We are satisfied with your servse.");
	}
}
