package learn;

public class matadd {

	public static void main(String[] args) {
		int a[][] = {{3,4,5},{4,7,9},{3,4,5}};
		int b[][] = {{4,7,9},{5,4,5},{5,6,7}};
		add(a,b);
	}
	public static void add(int a[][],int b[][]) {
		int c[][] = new int [3][3];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
