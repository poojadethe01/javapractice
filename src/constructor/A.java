package constructor;

public class A {
	
	public  A ()
	{
		System.out.println("hi hi i am constructor");
	}
	
	public A (int a, int b)
	{    
		System.out.println(a*b);
	}
	public A (String name)
	{
		System.out.println(" my name is" + name);
	}
	
	public A (boolean value)
	{
		System.out.println(value);
	}
	public A (int d, float c)
	
	{
		System.out.println(  d*c);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A ();
		A aa = new A (78,90);
		A ab = new A ("elu");
		A b = new A(false);
		A c = new A (89 ,90f);
		
		

	}

}
