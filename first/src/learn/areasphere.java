package learn;

import java.util.Scanner;

public class areasphere {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius: ");
		int r = sc.nextInt();
		sp(r);
	}
	public static double sp(int r) {
//		double surface = 4*Math.PI*r*r;
		double vol = (Math.PI*r*r*r)*4/3;
		return vol;	
	}

}
