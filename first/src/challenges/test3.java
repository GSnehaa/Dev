package challenges;
//GCD of n numbers 
//import java.util.Scanner;
public class test3 {
	 public static int gcd(int num1,int num2) {
			if(num2 == 0) {
				return num1;
			}
			else {
				return gcd(num2, num1%num2);
			}
		}
	   public static void main(String arg[]){
	      int[] arr = {19, 38, 76, 133};
	      int result = gcd(arr[0],arr[1]);
	      for(int i = 2; i < arr.length; i++){
	         result = gcd(result, arr[i]);
	      }
	      System.out.println("Gcd of n numbers is: "+result);
	   }
}






