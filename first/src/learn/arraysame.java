package learn;

public class arraysame {
	public static void main(String args[]) {
		int i[][] = {{34,45,78},{34,45,64}};
		numbers(i);
	}
	public static void numbers(int a [][]){
		if(a[0].length == a[1].length) {
			for(int i=0;i<a[0].length;i++) {
				if(a[0][i] == a[1][i]) {
					int b = a[0][i];
					System.out.println("the Same numbers are " + b + " ");
				}
				else {
					System.out.println("The numbers which are not same are: "+  a[0][i] + " " + a[1][i]);
				}
			}
		}
	}
}
