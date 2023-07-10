package learn;

import java.util.Scanner;

public class math_library {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of x: ");
		int y = sc.nextInt();
		lib(x,y);
	}
	public static void lib(int x, int y) {
		int m = Math.max(x, y);
		double sqroot = Math.sqrt(x);
		double log = Math.log(x);
		double power = Math.pow(x, y);		
		System.out.println("The max number is: "+ m);
		System.out.println("The square root of x is : "+sqroot);
		System.out.println("The log of x is : "+log);
		System.out.println("The power value is: "+ power);
	}	
}
