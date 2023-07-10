package learn;

import java.util.Scanner;

public class palindrom {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		number(num);
	}
	public static void number(int num) {
		int rev = 0, rem, original = num;
		while(num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(original == rev) {
			System.out.println("Is a palindrom");
		}
		else {
			System.out.println("Is not a palindrom");
		}
	}
}

