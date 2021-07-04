package constructersInJava;

class GotyaBhau{
	String Field, College;
	
	public void Sing() {
		System.out.println("Bhau is a very bad singer but we have to tell them they are good, very irritating.");
	}
	
	GotyaBhau(){
		System.out.println("As we can see the Constructor Gotya bhau is automatically called whereas the method Sing() needs to be called as shown.");
	}
}

public class MyConstructor {
	MyConstructor(){
		System.out.println("The Constructor is automatically called by just initializing the object.");
	}
	public static void main(String[] args) {
		MyConstructor Object = new MyConstructor();
		
		GotyaBhau Rushikesh = new GotyaBhau();
		Rushikesh.Field = "Mechanical Engineering";
		Rushikesh.College = "Government College Of Engineering And Research Avasari Khurd.";
		Rushikesh.Sing();

	}

}
