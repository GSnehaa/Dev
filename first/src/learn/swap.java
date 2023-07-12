package learn;

import java.util.Scanner;

public class swap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2 = sc.nextInt();
		number(num1,num2);
	}
	public static void number(int num1, int num2) {
		int num = num1;
		num1 = num2;
		num2 = num;
		System.out.println(num1);
		System.out.println(num2);

	}
	
}
