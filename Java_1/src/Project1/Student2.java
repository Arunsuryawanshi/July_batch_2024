package Project1;

public class Student2 {
	int roll_no;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you ");
		System.out.println("I am Arun Suryawanshi ");
	}
	public void display2()
	{
		System.out.println("Automation is very easy ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s2=new Student2();
		s2.display1();
		s2.display2();
		s2.roll_no=46;
		s2.age=30;
		System.out.println("roll_no= " +s2.roll_no);
		System.out.println("age= "+s2.age);
	}

}
