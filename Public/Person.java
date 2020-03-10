package Public;

public class Person {
	public String fname="Praveen";
	public String lname="Nagaraj";
	public String email="praveenneymar20@gmail.com";
	public int age=23;
	
	public static void main(String[] args) {
	    Person myObj = new Person(); 
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
}
