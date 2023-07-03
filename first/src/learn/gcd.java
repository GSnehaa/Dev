package learn;

import java.util.Scanner;

public class gcd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 = sc.nextInt();
		number(num1, num2);		
	}
	public static int number(int num1,int num2) {
		int a = 0;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i == 0 && num2%i == 0) {
				a = i;
			}
		}
		System.out.println(a);
		return a;
	}

}
