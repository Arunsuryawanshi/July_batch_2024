package Project1;

public class Arithmatics2 {
	
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
	public int Mul(int a2, int b2) {
		int c2;
		c2=a2*b2;
		System.out.println("Mul= "+c2);
		return c2;
	}
	public void Div(int a3, int b3) {
		int result;
		result=a3/b3;
		System.out.println("Final result= "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmatics2 obj=new Arithmatics2();
		
		int sumresult1=obj.sum(10,2);
		int sumresult2=obj.sum(sumresult1,2);
		int subresult=obj.Sub(sumresult2, 2);
		int mulresult=obj.Mul(subresult, 2);
		obj.Div(mulresult, 2);
	}

}
