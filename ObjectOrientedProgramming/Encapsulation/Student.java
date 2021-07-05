package oops.encapsulation;

public class Student {

 private int age;
 private String name;
 
 public int getAge() {
	 return age;
 }

 public void setAge(int age) {
	if (age > 20) {
		System.out.println("Sorry! you are over aged to attend our School.");
	}else {
		this.age = age;
	}
 }
// Right click - Source - generate getters and setters - remember this path to generate them.
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
