package loops;

import accespecifier.A;

public class ForLoopA extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForLoopA a  = new ForLoopA();
		a.N();
		
		
		// i want to print 3 table
		
		for(int i=3; i<=30; i=i+3)//initilization, conditin increment/decrement operator
		{
			System.out.println(i);
		}
		
		
		System.out.println("************************");
		// i want to write 5 table 
		
		for (int i=5; i<=50; i=i+5)
		{
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++++++++");
		// i want to write reverse 7 table
		
		for(int j=70;j>=7; j=j-7)
		{
			System.out.println(j);
		}
		System.out.println("++++++++++++++++++");
		// i want to write 8 table in revse
		for(int k=80;k>=8;k=k-8)
		{
			System.out.println(k);
		}
		
		
		
		

	}

}
