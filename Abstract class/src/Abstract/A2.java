package Abstract;

public class A2 extends A1 {
	
	public void m1()
	{
		System.out.println("m1---A2");
	}

	public static void main(String[] args) {
		
		A2 a=new A2();
		a.m1();
	}
}
