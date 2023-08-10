package challenges;
//A happy number is a number which yields a 1 
//by repeatedly summing up the square of its digits
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		number(num);
	}
	public static void number(int num) {
		while(num>10) {
			int sum = 0,rem;
			while(num!=0) {
				rem = num%10;
				num/=10;
				sum += rem*rem;
			}
			if(sum != 1) {
				num = sum;
			}
			else {
				System.out.println("Is an happy number");
			}
			if(num<10 && sum !=1) {
				System.out.println("Is not an happy number");
			}
		}		
	}

}


