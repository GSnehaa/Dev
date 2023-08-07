package learn;

import java.util.ArrayList;

public class arrlist1 {

	public static void main(String[] args) {
		String s = "*";
		list(s);
		
	}
	public static ArrayList<Object> list(String s){
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(s);
		System.out.println(arr);
		return arr;		
		
	}
}
