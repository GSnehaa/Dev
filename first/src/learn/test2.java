package learn;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		y on = new y();
		ArrayList<Integer> a3 = on.a2();
	
	}
}
	class x {
	public static ArrayList<Integer> a1(){
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(7);
		a1.add(3);
		a1.add(4);
		return a1;
	}
	}
	class y extends x{
		public static ArrayList<Integer> a2(){
		ArrayList<Integer> a3 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(3);
		a2.add(2);
		a2.add(1);
		ArrayList<Integer> a1 = x.a1();
		for(int i = 0;i<a2.size();i++) {
				int c = a1.get(i)-a2.get(i);
				a3.add(c);
		}
		return a3;
	}
	}
	
	
	
	

	

