package learn;

import java.util.Scanner;

public class c_interest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle amount: ");
		double p = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double r = sc.nextDouble();
		System.out.println("Enter the number of time: ");
		double n = sc.nextDouble();
		System.out.println("Enter the time period: ");
		int t = sc.nextInt();
		cinterest(p,r,n,t);
				
	}

public static double cinterest(double p, double r, double n, int t) {
	double ci = p*(Math.pow(1+r/100, n*t))-p;
	System.out.println(ci);
	return ci;	
}
}
