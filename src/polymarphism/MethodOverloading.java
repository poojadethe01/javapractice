package polymarphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading s =  new MethodOverloading ();
		s.test();
		s.test(99, 55);
		s.test(77, 90);
		
		
	}	
	
	public void test ()
	{
		System.out.println("i am test method");
	}
	public void test (int a,int b )
	{ a=99;
	  b=55;
	  System.out.println(a+b);
		
	}
	public void test (int c,float d )
	{   c=77;
	    d= 90;
	    System.out.println(c+d);
		
	}
	
	

	

}
