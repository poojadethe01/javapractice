package variable;

public class A extends  Variable {
	
	
	int num = 89;
	int numO = 99;
	
	public void D ()
	{
		System.out.println(num*numO);
	}	
	
	
	

	public static void main(String[] args) {
		
	       A a = new A ();
			a.C();
			a.A();
			a.B();
			a.D();
		
		

	}

	
	
	public void C ()
	{
		System.out.println(super.name);
	}
}
