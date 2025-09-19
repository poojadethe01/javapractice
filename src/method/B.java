package method;

public class B  extends A{
	
	public static void c ()
	{
		System.out.println("I am staic c method");
	}
	
	public void d ()
	{
		System.out.println("new git bash branch");
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A.AB();
		c();
		A a = new A();
		a.BC();
		
		B b = new B ();
		b.d();
		
	
		
  
	}

}
