package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkHasetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashSet<Object>  li = new LinkedHashSet<Object>();
        li.add("name");
        li.add(89);
        li.add(true);
        li.add(90.0);
        li.add("euuu");
        li.add("name");
        System.out.println(li);
        
        for(Object b:li)
        		
        {
        	System.out.println(b);
        }
		System.out.println("+++++++++++++++++++++++++++++++");
       Iterator<Object> it = li.iterator();
       
      
	while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
		
		
	}

}
