package string;

public class SplitTwo {

	public static void main(String[] args) {
		
		
		String s= " i love my country";
		String[] sOne = s.split(" ");
		
		for(int i=0;i<=sOne.length-1;i++)
		{
			System.out.println(sOne[i]);
		}
		String t = sOne[4];
		sOne[4]=t.replace("country", "india");
		
		for(int j=0;j<=sOne.length-1;j++)
		{
			System.out.println(sOne[j]);
		}
		
	}

}
