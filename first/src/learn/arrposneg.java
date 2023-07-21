package learn;
import java.util.Arrays;
import java.util.Scanner;

public class arrposneg {
	public static void main(String args[]) {
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int num[] = new int [n];
		System.out.println("Enter the array elements: ");
		for(j = 0;j<n;j++) {
		num[j] = sc.nextInt();				
		}
		pn(num);
	}
public static void pn(int []num) {
	int negative [] = new int[5];
	int n = 0;
	int post[] = new int [5];
	int p = 0;
	for(int i = 0; i<num.length;i++) {
		if(num[i]<0) {
			negative[n++] = num [i];
		}
		else {
			post[p++] = num[i];
		}
	}
	System.out.println("The negative elements in array are : "+ Arrays.toString(negative));
	System.out.println("The negative elements in array are : "+Arrays.toString(post));
	}
}







