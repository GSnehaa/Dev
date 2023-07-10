package learn;

import java.util.Scanner;

public class areacube {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		int a = sc.nextInt();
		cube(a);
	}
	public static int cube(int a) {
		int surface = 6*a*a;
//		int vol = a*a*a;
//		return vol;
		return surface;
	}
}
