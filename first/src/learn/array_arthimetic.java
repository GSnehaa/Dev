package learn;

import java.util.Scanner;

public class array_arthimetic {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int []a = new int[size];
		int []b = new int[size];
		int []c = arith(a,b);
	}
	public static int[] arith(int []a, int[] b) {
		int size;
		System.out.println("Enter the elements in an array: ");
		for(int i=1;i<=size;i++) {
			 a[i] = sc.nextint();
		}
	}
}
