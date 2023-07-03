package learn;

import java.util.Scanner;

public class s_interest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle value: ");
		int p = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		int r = sc.nextInt();
		System.out.println("Enter the time period: ");
		int t = sc.nextInt();
		sinterest(p,r,t);
	}

	public static int sinterest(int p, int r, int t) {
		int si = (p*r*t)/100;
		System.out.println(si);
		return si;
	}
}
