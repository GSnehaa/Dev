package learn;

public class matlowertri {

	public static void main(String[] args) {
		int a [][] = new int [4][4];
		lowertri(a);
	}
	public static void lowertri(int a[][]) {
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j<=i) {
				System.out.print(6 + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

