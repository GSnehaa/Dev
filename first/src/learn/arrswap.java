package learn;

public class arrswap {

	public static void main(String[] args) {
		int a [] = {4,5};
		number(a);
	}
	public static void number(int a[]) {
		a[0]=a[0]+a[1];
		a[1]=a[0]-a[1];
		a[0]=a[0]-a[1];
		System.out.println(a[0] + " " + a[1]);		
	}
}
