package learn;

import java.util.Scanner;

public class daysinmonth {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int m = sc.nextInt();	
		if(m<=12 && m>=1) {
			System.out.println("Enter the year: ");
			int y = sc.nextInt();
		date(m,y);
		}
			
	}
	public static void date(int m, int y) {
		int days = 0;
		if( m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			days = 31;
		}
		else {
			if(m==4 || m==6 || m==9 || m==11) {
				days = 30;
			}
			else {
				if(m==2) {
					if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
						days = 29;
					}
					else {
						days = 28;
					}
				}
			}
		}
		System.out.println(days);	
	}
}



