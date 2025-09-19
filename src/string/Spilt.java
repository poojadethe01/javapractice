package string;

public class Spilt {

	public static void main(String[] args) {
		
		
		String s= "I love India";
		String[] sOne = s.split(" ");
		
		for(int i=0;i<=sOne.length-1;i++)
		{
			System.out.print(sOne[i]+" ");
		}
		String a = sOne[3];
		System.out.println(a);
		sOne[3]=a.replace("india", "country");
		
		for(int i=0;i<=sOne.length-1;i++)
		{
			System.out.print(sOne[i]+" ");
		}
		
		System.out.println("++++++++++++++++++++++++++");
		
		String name = "Era bhanu Dethe";
		String[] nameO = name.split(" ");
		
		for(int j=0;j<= nameO.length-1;j++)
		{
			System.out.print(nameO[j]);
		}
		
		String t = nameO[2];
		nameO[2]=t.replace("Dethe", "ambekar");
		
		for(int j=0;j<= nameO.length-1;j++)
		{
			System.out.println(nameO[j]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

	

}
