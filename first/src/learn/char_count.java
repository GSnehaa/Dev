package learn;

import java.util.Scanner;

public class char_count {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		cc(str);		
	}
	public static void cc(String str) {			
		for(char c='a';c<='z';c++) {
			int count = 0;
			for(int i = 0;i<=str.length();i++) {
				if(c == str.charAt(i)) {
					count ++;
				}
			}
			if(count != 0) {
				System.out.println("count of "+c+" is: "+count);
			}
		}
	}
}


