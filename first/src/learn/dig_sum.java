package learn;
import java.util.Scanner;
public class dig_sum {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			number(num);
		}
		public static int number(int num) {
			int sum = 0;
			while(num != 0) {
				sum = sum + num%10;
				num /= 10;	
			}
			System.out.println(sum);
			return sum;
		}
}


