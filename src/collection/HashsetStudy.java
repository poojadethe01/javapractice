package collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetStudy {

	public static void main(String[] args) {
		
		HashSet<Integer> h= new HashSet<Integer>();
		h.add(99);
		h.add(89);
		h.add(55);
		h.add(34);
		h.add(99);
		System.out.println(h);
		
		for(Integer b:h)//for each
		
		{
			System.out.println(b);
		}
		System.out.println("********************");
		
		Iterator<Integer> it = h.iterator();//iterater
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
