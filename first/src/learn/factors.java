package learn;

import java.util.Scanner;

public class factors {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		number(num);
	}
	public static void number(int num) {
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
