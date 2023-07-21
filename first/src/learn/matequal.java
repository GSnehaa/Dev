package learn;

public class matequal {

	public static void main(String[] args) {
		int a[][] = {{3,4,5},{5,6,7},{4,7,9}};
		int b[][] = {{3,4,5},{5,6,7},{4,7,9}};
		equal(a,b);
	}
	public static void equal(int a[][],int b[][]) {
		int eq = 0;
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[0].length;j++) {
				if(a[i][j] != b[i][j]) {
					eq = 1;
				}
			}
		}
		if(eq == 0) {
			System.out.println("Both Matrix are equal");
		}
		else {
			System.out.println("Both Matrix are not equal");
		}
	}
}


