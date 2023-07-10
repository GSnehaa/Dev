package learn;

import java.util.Scanner;
//for 3 digit number - eg: 371--3 dig--3*3*3 + 7*7*7 + 1*1*1 = 371
// eg : 23-- 2 dig-- 2*2 + 3*3 = 23 
public class amstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 digit number: ");
		int num = sc.nextInt();
		number(num);
	}
	public static void number(int num) {
		int remainder,result=0,originalnum;
		originalnum = num;
		while(originalnum != 0) {
			remainder = originalnum%10;
			result +=Math.pow(remainder, 3);
			originalnum /= 10;
		}
		if(result == num) {
			System.out.println("Is an amstrong number");
		}
		else {
			System.out.println("Is not an amstrong number");
		}
	}
}
