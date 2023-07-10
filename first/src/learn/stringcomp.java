package learn;

import java.util.Scanner;

public class stringcomp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String a = sc.next();
		System.out.println("Enter string 2");
		String b = sc.next();
		strcomp(a,b);
		
	}
	public static boolean strcomp(String a, String b) {
		if(a.equals(b)) {
//			System.out.println("Is equal");
			return true;
		}
		else {
//			System.out.println("Is not equal");
			return false;		
		}
		
	}

}
