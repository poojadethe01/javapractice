package interfaceA;

public class AbstactionClass extends Abstaction implements A {

	public static void main(String[] args) {
		AbstactionClass a = new AbstactionClass();
		a.aho();
		a.sagar(); 
		a.prashat();
		a.vikas();
		a.test();
		a.B();

	}

	@Override
	public void vikas() {
		// TODO Auto-generated method stub
		System.out.println("this is vikas delovper");
	}

	@Override
	public void sagar() {
		int a= 99;
		int b= 88;
		System.out.println(a+b);
		
	}

	@Override
	public void aho() {
		boolean  t = true;
		boolean tO = false;
		System.out.println(t);
		
		
	}

	@Override
	public void prashat() {
		System.out.println("i am prashat");
	}

	@Override
	public void test() {
		System.out.println("i am interface");
		
	}

	@Override
	public void B() {
		// TODO Auto-generated method stub
		System.out.println("i am interface two");
	}

	@Override
	public void C() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void D() {
		// TODO Auto-generated method stub
		
	}

}
