package learn;

public class matprint {
	public static void main(String args[]) {
	int a[][] = {{3,4,5},{3,6,2}};
	element(a);
	}
	public static void element(int a[][]) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
