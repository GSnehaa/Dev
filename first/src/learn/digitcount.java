package learn;

import java.util.Scanner;

public class digitcount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits: ");
		int num = sc.nextInt();
		digits(num);
	}
	public static void digits(int num) {
		int count = 0;
		while(num != 0) {
			num /= 10;
			count ++;	
		}
		System.out.println(count);

	}

}
