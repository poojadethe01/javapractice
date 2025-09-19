package constructor;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b = new B ();
		B b1 = new B (90,90);
		B b2 = new B ("ladu");
		

	}

	
	
	public  B ()
	{
		System.out.println("i am pooja");
	}
	
	public B (int a,int b)
	{
		System.out.println(a*b);
	}
	
	public B (String name) 
	{
		System.out.println(name);
	}
}
