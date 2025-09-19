package polymarphism;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		C c = new C ();
		c.main();
		c.main(90, 80);
		c.main("elu");
		//c.main(args);
		
		
		
	}
	
	public static void main()
	{
		System.out.println("this is main method");
	}
	public static void main (String name)
	{
		System.out.println("this is second ovverlod");
	}
	public void main(int a,int b)
	{
		System.out.println(a*b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
