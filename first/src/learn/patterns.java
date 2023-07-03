package learn;

public class patterns {

	public static void main(String[] args) {
		p1(5);
	}
		
	public static  void p1(int n) {
		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=i;j++) {
//			for(int j=0;j<=n;j++) {
			for(int j=0;j<=n-i;j++) {
//			for(int j=0;j<=i;j++) {
				System.out.print(j);
//				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}	




