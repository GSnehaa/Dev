package learn;

import java.util.ArrayList;

public class arrlist {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aa");
		arr.add("bb");
		arr.add("cc");
		arr.add("dd");
//		System.out.println(arr.get(2));
//		arr.set(1, "eee");
		System.out.println(arr);
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add(arr);
//		arr2.add(arr);
//		arr2.add(arr);
//		ArrayList<Object> arr1 = new ArrayList<Object>();
//		arr1.add(arr);
//		arr1.add(arr2);
//		System.out.println(arr2);
		for(Object o : arr2) {
			ArrayList<String> st = (ArrayList<String>)(o);
			for(String s : st) {
				System.out.println(s);
			}
		}

	}
}



