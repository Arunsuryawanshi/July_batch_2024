package Project1;

public class Student1 {
	
	int a;
	public void display () {
		
		System.out.println(" Welcome to Student Class");
	}
	public static void main(String[] args) {
		Student1 arun=new Student1();
		arun.display();
		System.out.println("I am the main method");
		arun.display();
		arun.a=12;
		System.out.println("Value of a " +arun.a);
		arun.a=34;
		System.out.println("Value of a " +arun.a);
	}

}
