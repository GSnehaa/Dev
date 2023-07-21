package learn;
import java.util.*;
public class genericroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		number(a);
	}
	public static void number(int num) {
		int sum = 0, rem;
		while(num>10) {
			sum = 0;
			while(num!=0) {
				rem = num%10;
				num /=10;
				sum +=rem;
			}
			if(sum>10) {
				num = sum;
			}
			else {
				break;
			}
		}
		System.out.println(sum);
	}
}



