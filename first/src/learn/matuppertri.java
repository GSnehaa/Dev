package learn;

public class matuppertri {

	public static void main(String[] args) {
		int a[][] = {{3,4,5},{4,7,9},{3,4,5}};
		uppersum us = new uppersum();
		us.tri(a);
		us.sum(a);
	}
}
class uppertri{
	public void tri(int a[][]) {
		System.out.println("The upper triangle : ");
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j>=i) {
				System.out.print(a[i][j] + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
class uppersum extends uppertri{
	public void sum(int a[][]) {
		System.out.println("The sum of upper triangle : ");
		int c = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j>=i) {
				c += a[i][j];
				}
			}
		}
		System.out.println(c);
	}
}



