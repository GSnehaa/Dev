package learn;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		number(num);
	}
	public static int number(int num) {
		int i = 1, fact =1;
		while(i<=num) {
			fact *=i;
			i++;
		}
		return fact;
	}
}
