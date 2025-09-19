package array;

public class MutlilevelArray {

	public static void main(String[] args) {
	
		int a [] [] [] = {{{77,88,99,00,77},{45,55,77,33,33},{44,77,88,54,34}}};
		
		System.out.println(a[0] [0] [4]);
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=4;j++)
			{
				for(int k=0;k<=4;k++)
				{
					System.out.print(a[i][j][k] +" ");
				}  System.out.println();
			}
		}
		

	}

}
