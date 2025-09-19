package string;

public class SplitN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "This is elus Birthday";
		String[] S1 = s.split(" ");
		
		for(int i=0;i< S1.length;i++)
		{
			System.out.println( S1[i]);
		}
		System.out.println("+++++++++++++++++++++++++");
		String t = S1[3];
		S1[3]=t.replace("elus", "ladu");
		
		for(int i=0;i< S1.length;i++)
		{
			System.out.println( S1[i]);
		}
		
	}

}
