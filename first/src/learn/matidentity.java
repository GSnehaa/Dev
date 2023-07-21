package learn;

public class matidentity {

	public static void main(String[] args) {
		int a[][] = new int[4][4];
		identity(a);
	}
	public static void identity(int a[][]) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				if(i == j) {
					a[i][j] = 1;
				}
				else {
					a[i][j] = 0;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}



