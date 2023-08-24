package Abstract;

public  class DemoTest extends Demo {
	
	public void m2()
	{
		  System.out.println("m2---DemoTest");
	}
	
	
	public static void main(String[] args) {
		
		DemoTest d=new DemoTest();
		d.m1();
		d.m2();
		
	}

}
