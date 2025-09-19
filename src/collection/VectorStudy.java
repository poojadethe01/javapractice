package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		
	   Vector<String> v = new Vector<String>();
	   
	   v.add("phone");
	   v.add("seema");
	   v.add("sim");
	   v.add("charger");
	   v.add("mouse");
	   
	   System.out.println(v);
	   //Enumarator  l
	  ListIterator<String> li = v.listIterator();
	  
	  while(li.hasNext())
	  {
		  System.out.println(li.next());
	  }
	  System.out.println("**********************************");
	  
	  for(int i=0;i<=v.size()-1
			  ;i++)
	  {
		  System.out.println(v.get(i));
	  }
	  System.out.println("++++++++++++++++++++++++++++");
	  
	  for(String b:v)
	  {
		  System.out.println(b);
	  }
	  System.out.println("+++++++++++++++++++++++++++++++++++++");
	  
	   Iterator<String> it = v.iterator();
	   
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	   //enumatror
	   Enumeration<String> E = v.elements();
	   
	   while (E.hasMoreElements())
	   {
		   System.out.println(E.nextElement());
	   }
	   

	}

}
