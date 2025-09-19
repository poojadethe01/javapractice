package interfaceA;

public class AN  extends AbstactionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AN a = new AN ();
		a.phone();
		a.seem();
		

	}

	@Override
	public void phone() {
		System.out.println("i am phone");
		
	}

	@Override
	public void seem() {
		System.out.println("i am seem");
		
	}

	
}
