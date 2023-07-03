package learn;

import java.util.Scanner;

public class evensum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		number(num);			
	}
	public static int number(int num) {
		int a = 0;
		for(int i=0;i<=num;i++) {
			if(i%2 == 0) {
				a = a+i;				
			}
		}
		System.out.println("The sum of even number upto "+num+" is "+a);
		return a;
	}
}
