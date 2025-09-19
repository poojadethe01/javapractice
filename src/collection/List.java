package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String > a = new ArrayList<String>();
		a.add("pooja");
		a.add("elu");
		a.add("ladu");
		a.add("bhanu");
		
		System.out.println(a);
		
		for(int i=0;i<=a.size()-1;i++)
				
		{
			System.out.println(a.get(i));
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//for each
		
		for (String b:a)
		{
			System.out.println(b);
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		//listIterator
		ListIterator<String> li = a.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Iterator<String> it = a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
		
		
		
		
		
		
		
		
	}

}
