package accespecifier;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A ();
		a.AB();
		a.C();
		a.E();
		a.N();
		
	}
	
	public void AB() //throuout the project
	{
		System.out.println("i am public method");
	}
	
	private void  C ()// within same class
	{
		 System.out.println("i am private method");
	}
	
	  void  E () //trouout the package
	 {
		 System.out.println("i am deafault void method");
	 }
	 
	 protected void N ()  //through out the packege
	 {
		 System.out.println("i am protected method");
	 }

}
