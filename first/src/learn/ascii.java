package learn;

import java.util.Scanner;

public class ascii {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");	
		char ch = sc.next().charAt(0);
		asciivalue(ch);
		
	}
	public static int asciivalue(char ch) {
		int av = ch;
		System.out.println(av);
		return av;		
	}

}
