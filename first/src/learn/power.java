package learn;

import java.util.Scanner;

public class power {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  base number: ");
		int b = sc.nextInt();
		System.out.println("Enter the power number: ");
		int e = sc.nextInt();
		powernumber(b, e);
	}

	public static double powernumber(int b, int e) {
		int pow = 1;
		for(int i=1;i<=e;i++) {
			pow = pow*b;
		}
		System.out.println("The power of "+b+" power "+b+" is: "+pow);
		return pow;
	}
}

