package learn;

import java.util.ArrayList;

public class test3 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add(" ");
		a.add("1");
		a.add(" ");
		a.add("3");
		a.add(" ");
		a.add(" ");
		a.add(" ");
		a.add("1");
		while(a.contains(" ")) {
			a.remove(" ");
		}
		System.out.println(a);
	}
}
