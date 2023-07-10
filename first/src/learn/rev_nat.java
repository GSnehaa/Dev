package learn;

import java.util.Scanner;

public class rev_nat {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int a = sc.nextInt();
			num(a);
		}

		public static void num(int a) {
			for(int i = a;i>=1;i--) {
				System.out.print(i + " ");
			}
		}
		
}


