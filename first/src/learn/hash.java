package learn;

import java.util.*;

public class hash {
	

	public static void main(String[] args) {
		int  n=100;
		str(n);
		
		
	}	
		public static int  str(int n) {
		HashSet <Object> a = new HashSet<Object>();
		a.add(n);
		a.add(5);
		a.add(3);
		System.out.println(a);
		HashSet<Object> aa = new HashSet<Object>();
		aa.addAll(a);
		aa.add(4);
		System.out.println(aa);
		Iterator<Object> it = aa.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		boolean b = aa.remove(4);
		System.out.println(b);
		HashSet <Object> h = new HashSet<Object>();
		h.add(1);
		h.retainAll(a);
		System.out.println(h);
		HashSet<Object> hh = new HashSet<Object>();
		hh.add(1);
		hh.add(3);
		a.removeAll(hh);
		System.out.println(a);
		HashSet<Object> s = new HashSet<Object>();
		s.add("abc");
		s.add("cba");
		s.add("jkl");
		s.add("xyz");
		HashSet<Object> ss = new HashSet<Object>();
		ss.add("abc");
		ss.add("jkl");
		ss.add("xyz");
		boolean bb = s.containsAll(ss);
		System.out.println(bb);
		return n;		
	}	

}
