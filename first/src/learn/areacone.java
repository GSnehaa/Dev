package learn;

import java.util.Scanner;
public class areacone {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius: ");
		int r = sc.nextInt();
		System.out.println("enter the heigth: ");
		int h = sc.nextInt();
		cone(r,h);
	}
	public static double cone(int r,int h) {
		double surface = Math.PI*r*(r+Math.sqrt(h*h+r*r));
//		double vol = (Math.PI*r*r*h)/3;
		return surface;
//		return vol;	
}
}
