package oops.packages;

import oops.packages.SubPackage.Student;

public class MainClass {

	public static void main (String [] args) {
		
		Student first = new Student ("Mukund");
		System.out.println("Name of the first student is " + first.getName() + ".");
	}
}
