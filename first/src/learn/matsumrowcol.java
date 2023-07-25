package learn;

public class matsumrowcol {

	public static void main(String[] args) {
		int a[][] = {{3,5,4},{2,9,6}};
		colsum c = new colsum();
		c.row(a);
		c.col(a);
	}
}
class rowsum{
	public void row(int a[][]) {	
		for(int i = 0;i<a.length;i++) {
			int sum = 0;
			for(int j = 0;j<a[i].length;j++) {
				sum += a[i][j];
			}
			System.out.println("The sum of row "+i+" is : "+sum);
		}
	}
}
class colsum extends rowsum{
	public void col(int a[][]) {	
		for(int i = 0;i<a[0].length;i++) {
			int sum = 0;
			for(int j = 0;j<a.length;j++) {
				sum += a[j][i];
			}
			System.out.println("The sum of col "+i+" is : "+sum);
		}
	}
}


