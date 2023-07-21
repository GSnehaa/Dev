package learn;

public class matarith {

	public static void main(String[] args) {
		int a[][] = {{3,4,5},{4,7,9},{3,4,5}};
		int b[][] = {{4,7,9},{3,4,5},{5,6,7}};
		matmul mat = new matmul();
		mat.num(a, b);
		mat.num1(a, b);
		mat.num3(a, b);
	}
}
class mataddition{
	public void num(int a[][],int b[][]) {
		System.out.println("Matrix addition : ");
		int c[][] = new int [3][3];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
class matsub extends mataddition{
	public void num1(int a[][],int b[][]) {
		System.out.println("Matrix subtraction : ");
		int c[][] = new int [3][3];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class matmul extends matsub{
	public void num3(int a[][],int b[][]) {
		System.out.println("Matrix multiplication : ");
		int c[][] = new int [3][3];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}	
}



