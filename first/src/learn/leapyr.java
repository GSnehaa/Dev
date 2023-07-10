package learn;

import java.util.Scanner;

public class leapyr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int yr = sc.nextInt();
		leap(yr);
	}
	public static void leap(int yr) {
		if(yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
}
