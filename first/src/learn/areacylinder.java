package learn;

import java.util.Scanner;

public class areacylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		System.out.println("Enter the height: ");
		int h = sc.nextInt();
		cylinder(r,h);
	}

	public static double cylinder(int r, int h) {
//		double vol = Math.PI*r*r*h;
		double surface = (2*Math.PI*r*h) + (2*Math.PI*r*r);
		return surface;
//		return vol;	
	}	
}
