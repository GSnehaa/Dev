package learn;

import java.util.Scanner;

public class asciistring {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String a = sc.nextLine();
		alphabets(a);
	}
	public static void alphabets(String a) {
		for(int i=0;i<=a.length();i++) {
			char ch = a.charAt(i);
			int av = ch;
			System.out.println("ascii value of "+ch+" is "+av);
		}
	
	}

}
