package learn;

import java.util.Scanner;

public class reversenum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		number(n);
	}
	public static int number(int n) {
		int rev = 0,rem;
		while(n !=0) {
			rem = n%10;
			rev = rev*10+rem;
			n/=10;
		}
		return rev;
	}	
}
