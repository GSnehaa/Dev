package learn;

import java.util.Scanner;

public class areatrapezoid {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of side a : ");
		int a = sc.nextInt();
		System.out.println("Enter the length of side b: ");
		int b = sc.nextInt();
		System.out.println("Enter the height h: ");
		int h = sc.nextInt();
		area(a, b, h);
	}

	public static float area(int a,int b,int h) {
		float areatrape = ((a+b)*h)/2;
		System.out.println(areatrape);
		return areatrape;
}
}	
