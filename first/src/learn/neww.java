package learn;

import java.util.*;

public class neww {
	//[[[*,*,*],[*,*,*],[*,*,*]],[[*,*,*],[*,*,*],[*,*,*]]]

	public static void main(String[] args) {
		String a = "*";
		ArrayList<Object> obj = star(a);
		System.out.println(obj);

	}
	public static ArrayList<Object> star(String a) {
	
		ArrayList<Object> sk = new ArrayList<Object>();
	    for(int k =0;k<2;k++) {
			ArrayList<Object> s = new ArrayList<Object>();  
			for(int j =0;j< 2;j++) { 
				ArrayList<String> ss = new ArrayList<String>();  
			    for(int st = 0;st<3;st++) {
				    	 ss.add(a);
					}
			   s.add(ss);
			}
			sk.add(s);
		}
		return sk;
	}	
}

