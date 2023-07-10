package learn;

import java.util.Scanner;

public class nat_sum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a = sc.nextInt();
		num(a);
	}
	public static void num(int a) {
		int sum = 0,i=1;
		while(i<=a) {
			sum +=i;
			i++;
		}
		System.out.println("The sum of "+a+" natural number is: "+sum);
	}

}
