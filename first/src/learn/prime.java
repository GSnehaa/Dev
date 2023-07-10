package learn;

import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of value: ");
		int n = sc.nextInt();
		number(n);
	}
	public static void number(int n) {
		int count,sum = 0;
		for(int j=2;j<=n;j++) {
			count = 0;
			for(int i = 1;i<=j;i++) {
				if(j%i == 0) {
					count++;
				}
			}			
			if(count==2) {
				System.out.println(j+" ");		
				sum = sum + j;
			}		
		}
		System.out.println("The sum of prime number upto "+n+" is: "+sum);
	}
}
