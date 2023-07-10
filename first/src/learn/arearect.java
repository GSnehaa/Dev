package learn;

import java.util.Scanner;

public class arearect {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length value: ");
		int l = sc.nextInt();
		System.out.println("Enter breadth value: ");
		int b = sc.nextInt();
		rect(l, b);
	}

	public static float rect(int l,int b) {
		float rectangle = l*b;
		System.out.println(rectangle);
		return rectangle;	
	}
}

