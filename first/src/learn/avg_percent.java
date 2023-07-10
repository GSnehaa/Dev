package learn;

import java.util.Scanner;

public class avg_percent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of 1st subject : ");
		int m1 = sc.nextInt();
		System.out.println("Enter the mark of 2nd subject : ");
		int m2 = sc.nextInt();
		System.out.println("Enter the mark of 3rd subject : ");
		int m3 = sc.nextInt();
		marks(m1,m2,m3);
	}
	public static void marks(int m1,int m2, int m3) {
		double tot = m1+m2+m3;
		double avg = tot/3;
		double per = (tot)/3;
		System.out.println("total is : "+ tot);
		System.out.println("average is : "+ avg);
		System.out.println("percentage is : "+ per + "%");

	}
}
