package learn;

import java.util.*;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		List onj= new ArrayList();
		String name = "commercial";
		Map <String,Object> o = (Map <String,Object>)test("commercial");
		onj.add(o);
	}		
			
	public static Map <String,Object> test(String name) {
		
	
	Map <String,Object> q = new HashMap<String, Object>();
	
	
	Map <String,Integer> qq = new HashMap<String, Integer>();
	qq.put("id1", 12);
	qq.put("sneha", 23);

	q.put("Day 1",qq );
	Map <String,Object> qqq = new HashMap<String, Object>();
	qqq.put(name, q);
	System.out.println(qqq);
	return qqq;
	
	}
}



