package learn;

import java.util.Scanner;

public class areacir {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		cir(r);
	}

	public static double cir(int r) {
		double area = Math.PI*r*r;
		System.out.println(area);
		return area;	
	}

}

