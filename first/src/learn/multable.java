package learn;

import java.util.Scanner;

public class multable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int num = sc.nextInt();
		number(num);
	}

	public static void number(int num) {
		for(int i=0;i<=10;i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}
}
