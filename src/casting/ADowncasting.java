package casting;

public class ADowncasting  extends  Downcasting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ADowncasting a = new ADowncasting();
		a.car();
		a.education();
		a.sun();
		a.sunbike();
		Downcasting d = new ADowncasting ();
		d.car();
		d.education();
		
		
		
	}
	
	public void sun()
	{
		System.out.println("educatuion Softwareinginnering");
	}
	
	public void sunbike()
	{
		System.out.println("sun bike");
	}

}
