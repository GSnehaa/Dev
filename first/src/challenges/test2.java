package challenges;
//sum of 2 number -> product of digit until it becomes 1 
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number 1 : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the number 2 : ");
				int num2 = sc.nextInt();
				int num = num1 + num2;
				System.out.println("The sum of two numbers : "+num);
				number(num);
			}
			public static void number(int num) {
				int sum = 0, rem;
				while(num>10) {
					sum = 1;
					while(num!=0) {
						rem = num%10;
						num /=10;
						sum *=rem;
					}
					if(sum>10) {
						num = sum;
					}
					else {
						break;
					}
				}
				System.out.println("Product of digits: "+sum);
			}
}









