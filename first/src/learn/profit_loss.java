package learn;

import java.util.Scanner;

public class profit_loss {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the cost price: ");
	int cp = sc.nextInt();
	System.out.println("Enter the selling price: ");
	int sp = sc.nextInt();
	price(cp,sp);
	}

	public static void price(int cp, int sp) {
		if(cp>sp) {
			int loss = cp - sp ;			
			System.out.println("loss of "+ loss + " rupees");
		}
		else {
			int profit = sp - cp;
			System.out.println("profit of " + profit + " rupees");
		}
	}
}

