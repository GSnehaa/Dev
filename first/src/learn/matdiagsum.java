package learn;


public class matdiagsum {

	public static void main(String[] args) {
		int a[][] = {{5,3,4},{2,1,4},{7,6,2}};
		oppdiag d = new oppdiag();
		d.sum(a);
		d.sum1(a);
	}
}
class diagonal {
	public void sum(int a[][]) {
		int c = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = a.length;j>=0;j--) {
				if(i == j) {
					c+= a[i][j];
				}
			}
		}
		System.out.println("The sum of diagonal : " + c);		
	}
}
class oppdiag extends diagonal{
	public void sum1(int a[][]) {
		int c = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = a.length-1;j>=0;j--) {
				if(j==a.length-i-1) {
					c+= a[i][j];
				}
			}
		}
		System.out.println("The sum of opposite diagonal : " + c);		
	}
}
	


