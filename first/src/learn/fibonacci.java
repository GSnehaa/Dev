package learn;

import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int count = sc.nextInt();
		fib(count);
	}
	public static void fib(int count) {
		int n1 = 0; int n2 = 1;
		System.out.print(n1 + ",");
		for(int i = 1;i<=count;i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n1 + ",");

		}
	}

}
