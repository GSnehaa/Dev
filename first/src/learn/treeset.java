package learn;

import java.util.*;

public class treeset {

	public static void main(String[] args) {
		add();
	}
	public static void add() {
		TreeSet<String> s = new TreeSet<String>();
		s.add("Ram");
		s.add("Ajay");
		s.add("Ravi");
		s.add("Jhon");
		System.out.println(s);
		System.out.println(s.descendingSet());
		Iterator<String> i = s.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(s.headSet("Ram", false));
		System.out.println(s.subSet("Ajay",false, "Ravi", false));
		System.out.println(s.tailSet("Jhon", false));
	}
}
