package Project1;

public class Arithmatics {
	
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum= "+c);
		return c;
	}
	
	public int Sub(int a1, int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("Sub= "+c1);
		return c1;
	}
	public void Mul(int a2, int b2) {
		int result;
		result=a2*b2;
		System.out.println("Mul= "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatics a=new Arithmatics();
		
		int sumresult1=a.sum(10, 2);
		int sumresult2=a.Sub(10, 2);
		a.Mul(sumresult1, sumresult2);
	}

}
