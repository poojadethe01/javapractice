package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int a [] [] = {{89,90,54,34,45},{34,54,77,89,90}};
		
		System.out.println(a[0][4]);
		
		for(int i=0; i<=1;i++)//outer
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}

	}
	
	

}
