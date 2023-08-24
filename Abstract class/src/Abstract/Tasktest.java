package Abstract;

public class Tasktest extends Task1{

	public static void main(String[] args) {
	
		 Tasktest t=new Tasktest();
		 t.add();
		 System.out.println(t.a);
		 System.out.println(t.b);
		 System.out.println(t.c);
		 
	
		

	}

	@Override
	public void add() {
		System.out.println("add");
	}

}
