package learn;

import java.util.Scanner;

public class num_occurrence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		number(n);
		System.out.println(num(n));
	}
	public static int number(int n) {
		int count = 0;
		while(n>0) {
			if(n % 10 == 3) {
				count ++;
			}
			n = n/10;
		}
		return count;
	}
	public static int num(int n) {
		int count = 0;
		for(int i = 3;i<=n;i++) {
			count +=number(i);
		}	
		return count;		
	}	
}

