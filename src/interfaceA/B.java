package interfaceA;

public class B implements A,Test,C {

	public static void main(String[] args) {
		
		B b = new B ();
		b.B();
		b.C();
		b.D();
		b.test();
		b.E();
		b.F();
		b.G();
		b.aish();
		b.pooja();
		b.elu();
		b.ladu();
		
		

	}

	@Override
	public void test() {
		
		System.out.println("I am pooja Deyhe");
		
	}

	@Override
	public void B() {
		System.out.println("This is elu");
		
	}

	@Override
	public void C() {
		
		System.out.println("This is Athira");
		
	}

	@Override
	public void D() {
		int a=99;
		int b=88;
		System.out.println(a*b);
		
	}

	@Override
	public void E() {
		int c=55;
		float d = 99f;
		System.out.println(c*d);
		
	}

	@Override
	public void F() {
		
		System.out.println("this is ladus mom");
		
	}

	@Override
	public void G() {
		
		
	}

	@Override
	public void pooja() {
		System.out.println("This is pooja");
		
	}

	@Override
	public void aish() {
		System.out.println("hi this is aish");
	}

	@Override
	public void elu() {
		System.out.println("this is elu");
		
	}

	@Override
	public void ladu() {
		System.out.println("this is ladu");
	}

}
