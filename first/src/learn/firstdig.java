package learn;

import java.util.Scanner;

public class firstdig {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		first(num);
	}
		public static int first(int num) {
			while(num>=10) {
				num /= 10;
			}
			return num;
		}
		public static int last(int num) {
			while(num>=10) {
				num %= 10;
			}
			return num;
		}
}
