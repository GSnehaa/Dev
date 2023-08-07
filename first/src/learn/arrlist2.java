package learn;

import java.util.*;

public class arrlist2 {
	public static void main(String args[]) {
//		ArrayList<ArrayList<Object>> a = new ArrayList<>();
//			ArrayList<Object> a1 = new ArrayList<>();
//			a1.add(1);
//			a1.add(2);
//			a1.add(3);
//			a.add(a1);
//			System.out.println(a);
//			ArrayList<Object> a2 = new ArrayList<>();
//			a2.add(3);
//			a2.add(4);
//			a2.add(5);
//			a.add(a2);
//			System.out.println(a);
//			ArrayList<Object> a3 = new ArrayList<>();
//			a3.addAll(a);
//			System.out.println(a3);
		String st = "#";
		arr(st);
	}
	public static ArrayList<Object> arr (String st){

		ArrayList<Object> a1 = new ArrayList<>();
		for(int i = 0;i<2;i++) {
			ArrayList<Object> a2 = new ArrayList<>();
			for(int j = 0; j<2;j++) {
				ArrayList<Object> a3 = new ArrayList<>();
				for(int k = 0;k<4;k++) {
					a3.add(st);
				}
				a2.add(a3);
			}
			a1.add(a2);
		}
		System.out.println(a1);
		return a1;	
	}
}

