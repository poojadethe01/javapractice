package inheritance;

public class B  extends SingalLevelInheritance{

	public static void main(String[] args) {
		
		B b = new B();
		b.A();
		b.B(99, 99);
		b.C();
		b.D();

	}
	
	
	public void C ()
	{
		System.out.println("i am C non static method");
	}
	
	public void D ()
	{
		System.out.println("I am D non static method");
	}

}
