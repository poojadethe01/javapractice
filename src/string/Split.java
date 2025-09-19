package string;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is elphinstion college";
		String[] SO = s.split(" ");
		
		for(int i=0;i<=SO.length-1;i++)
		{
			System.out.println(SO[i]);
		}
		
		System.out.println("++++++++++++");
		String t = SO [2];
		
		SO [2]=t.replace("elphinstion", "jaihind");
		
		
		for(int i=0;i<=SO.length-1;i++)
		{
			System.out.println(SO[i]);
		}
		

	}

}
