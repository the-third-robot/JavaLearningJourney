package oops.Interfaces;

public class Person implements Student, YouTuber{
	String name;
	Person(String name){
		this.name = name;
		System.out.println("Hello! guys My name is " + name + " and I am glad to meet you all people." );
	}
	public static void main(String[] args) {
		Person Rushikesh = new Person("Rushikesh");
// Now I want to implement the properties of the Student as well as YouTuber class and for that I have to use Interfaces.
		
		Rushikesh.study("Bachler's Of Engineering", "GCOEARA");
		Rushikesh.Channel("Rushi Bhau", "Entertainment");
		
	}

	public void study (String Graduation, String CollegeName) {
		System.out.println("I am persuing My " + Graduation + " Degree in " + CollegeName + " College located in India.");
	}
	
	public void Channel (String ChannelName, String field) {
		System.out.println("I am running My " +ChannelName+ " YouTube Channel in India which is related to " + field);
	}

}
