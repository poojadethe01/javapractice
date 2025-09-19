package inheritance;

public class C extends B {   // multilevl inhiheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C ();
		c.A();
		c.B(80, 80);
		c.C();
		c.D();
		c.A();
		c.F();
		c.E();
		
		
	}
	
	public void E ()
	{
		System.out.println("i am E method non sttaic method");
	}
	
	public void F ()
	{
		System.out.println("i am F non static method");
	}

}
