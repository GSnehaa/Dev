package learn.test1;

public class patterns {
	public static void main(String args[]) {
		pat1(5);
	}

	public static void pat1(int n) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
