package array;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    
		int a [] [] = {{90,8,90,75,5},{90,89,3,4,5}};
		
		//System.out.println(a[0][1]);
		
		for(int i=0;i<=1;i++)//outer, row
		{
			for(int j=0;j<=4;j++)//innner,coloum
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
