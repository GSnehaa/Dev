package learn;

import java.util.Scanner;
public class sqnum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		number(a);
	}
	public static double number(int a) {
		double squareroot = Math.sqrt(a);
		double square = a*a;
		System.out.println(square);
		System.out.println(squareroot);
		return squareroot;
	}

}
