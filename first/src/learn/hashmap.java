package learn;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		String s = "commercial";
		test1(s);
	}
	public static Map<String, Object> test1(String s){
	Map<String,Object> m = new HashMap<String, Object>();
	Map<String,Object> m1 = new HashMap<String, Object>();
	m1.put("id1", 1);
	m1.put("id2", 2);
	Map<String,Object> m2 = new HashMap<String, Object>();
	m2.put("Day 1", m1);
	Map<String,Object> m3 = new HashMap<String, Object>();
	m3.put("id3", 3);
	m3.put("id4", 4);
	Map<String,Object> m4 = new HashMap<String, Object>();
	m4.put("Day 2", m3);
	m.put(s, m2);		
	System.out.println(m);
	return m;
	
	}

}
