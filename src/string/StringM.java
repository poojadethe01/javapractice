package string;

import java.util.ArrayList;


public class StringM {

	public static void main(String[] args) {

		
		ArrayList<Object>a = new ArrayList<>();
		a.add("elu");
		a.add(null);
		a.add("elu");
		a.add("ladu");
		System.out.println(a);
		a.addFirst("aishwa");
		System.out.println(a);
		a.addLast("bhanu");
		System.out.println(a);
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
	   // a.clone();
		System.out.println(a.clone());
		boolean b = a.contains("abc");
		System.out.println(b);
		boolean c = a.equals(a);
		System.out.println(c);
		Object d = a.get(4);
		System.out.println(d);
		boolean e = a.isEmpty();System.out.println(e);
		Object f = a.removeFirst();
		System.out.println(f);
		Object g = a.removeLast();
		System.out.println(g);
		int t = a.indexOf(g);
		System.out.println(t);
		int r = a.size();
		System.out.println(r);
		
		
		
		
		
	}

}
