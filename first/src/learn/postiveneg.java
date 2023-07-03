package learn;

import java.util.Scanner;

public class postiveneg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		number(num);
	}

public static void number(int num) {
	if(num>=0) {
		System.out.println(num + " is an positive number");
	}
	else {
		System.out.println(num + " is an negative number");
	}
}
}
