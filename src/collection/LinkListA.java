package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListA {

	public static void main(String[] args) {
		
	LinkedList<String> li =  new LinkedList<String>();
	
	li.add("mashin");
	li.add("Abc");
	li.add("gjoo");
	li.add("cvvvd");
	li.add("ddd");
	
	System.out.println(li);
	System.out.println("++++++++++================");	
		
	
	for(int i=0;i<=li.size()-1;i++)
	{
		System.out.println(li.get(i));
	}
	System.out.println("****************************");
	
	for (String a:li)
	{
		System.out.println(a);
	}
	System.out.println("++++++++++++++++++++++++++");
	
	ListIterator<String> lt = li.listIterator();
	while(lt.hasNext())
	{
		System.out.println(lt.next());
	}
	System.out.println("*********************");
		
	Iterator<String> s = li.iterator();
	
	while(s.hasNext())
	{
		System.out.println(s.next());
	}
		

	}

}
