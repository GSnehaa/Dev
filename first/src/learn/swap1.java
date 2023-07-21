package learn;
import java.util.Scanner;

public class swap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st element: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd element: ");
		int b = sc.nextInt();
		number(a,b);		
	}
	public static void number(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+ " "+b);	
	}
}
