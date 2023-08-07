package learn;

import java.util.*;

public class vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("abc");
		v.add("xyz");
		v.add("fgh");
		System.out.println(v);
		v.addElement("ert");
		v.addElement("yxz");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		if(v.contains("xyz")) {
			v.remove("xyz");
		}
		System.out.println(v);
	}
}
