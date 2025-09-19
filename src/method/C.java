package method;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.test();
		C.demo();
		C c= new C ();
		c.A();

	}
	
	public static void test()
	{
		System.out.println("i am test method");
	}
	public static void demo()
	{
		System.out.println("i am demo method");
	}
	public void A()
	{
		System.out.println("I am non static demo method");
	}

}
