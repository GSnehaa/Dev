package learn;

import java.util.Scanner;

public class matlowertri1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		int a [][] = new int[row][row]; 
		System.out.println("Enter the number of column : ");
		int col = sc.nextInt();
		if(row == col) {
			System.out.println("Enter the elements : ");
			for(int i = 0;i<a.length;i++) {
				for(int j = 0;j<row;j++) {
					a[i][j] = sc.nextInt();
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("The entered elements :");
			for(int i = 0;i<a.length;i++) {
				for(int j = 0;j<row;j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}	
		lowsum ls = new lowsum();
		ls.lowertri(a);
		ls.sum(a);
	}
}
class lowtri{
	public void lowertri(int a[][]) {
		System.out.println("Lower triangle : ");
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j<=i) {
				System.out.print(a[i][j] + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
class lowsum extends lowtri{
	public void sum(int a[][]) {
		int c = 0;
		System.out.println("The sum of lower triangle : ");
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j<=i) {
				c += a[i][j];
				}
			}
		}
		System.out.println(c);
	}
}


