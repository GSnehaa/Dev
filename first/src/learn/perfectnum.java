package learn;

import java.util.Scanner;
//the sum of divisor is equal to the original number
public class perfectnum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		number(num);
	}
	public static void number(int num) {	
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum +=i; 
			}
		}
		if(sum == num) {
			System.out.println("Is an perfect number");
		}
		else {
			System.out.println("Is not an perfect number");
		}
	}
}

