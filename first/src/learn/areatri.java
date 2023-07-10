package learn;

import java.util.Scanner;

public class areatri {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base value: ");
		int b = sc.nextInt();
		System.out.println("Enter heigth value: ");
		int h = sc.nextInt();
		tri(b, h);
	}

	public static float tri(int b,int h) {
		float areatriangle = (b*h)/2;
		System.out.println(areatriangle);
		return areatriangle;	
	}
}
