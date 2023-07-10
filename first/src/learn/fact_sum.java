package learn;
//strong number -- the sum of factorial is equal to the number 
import java.util.Scanner;

public class fact_sum {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			number(num);
		}
		public static void number(int num) {
			int i = 1, fact =1,sum = 0;
			while(i<=num) {
				fact *=i;
				i++;
			}
			System.out.println("The factorial of "+num+ " is : "+fact);	
//			sum +=i;
//			sum -=1;
//			System.out.println("The sum of factorial is : "+sum);	
			if(num == sum) {
				System.out.println("strong number");
			}
			else {
				System.out.println("not strong number");
			}
		}	
}

