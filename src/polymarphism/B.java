package polymarphism;

public class B extends  MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B ();
		b.test();
		b.testO();
		
		MethodOverriding m = new MethodOverriding();
		m.test();
		m.testO();
		
		

	}
	
	public void test()
	{
		System.out.println("i am extended methodoverriding");
	}
	public void testO()
	{
		System.out.println("i am two methodoveeriding");
	}

}
