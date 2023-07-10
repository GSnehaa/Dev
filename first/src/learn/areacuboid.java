package learn;

import java.util.Scanner;

public class areacuboid {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the width: ");
		int w = sc.nextInt();
		System.out.println("enter the heigth: ");
		int h = sc.nextInt();
		System.out.println("enter the length: ");
		int l = sc.nextInt();
		cuboid(w,h,l);
	}
	public static double cuboid(int w,int h,int l) {
//		double vol = w*h*l;
		double surface = 2*(l*w + w*h + l*h);
		return surface;
//		return vol;
		
}
}
