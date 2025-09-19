package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<String>();
		t.add("pooja");
		t.add("aish");
		t.add("elu");
		t.add("ladu");
		t.add("neha;");
		
		System.out.println(t);
		
		//iterator ,foreach
		
		for(String a:t)
		{
			System.out.println(a);
		}
		System.out.println("+++++++++++++++++++");
		
		Iterator<String>it = t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
