package learn;
public class array_arthimetic {
	public static void main(String args[]) {
		int [] a = new int[] {3,4,5,6};
		int [] b = new int[] {1,6,7,8};
		arith(a,b);
	}
	public static int[] arith(int []a, int[] b) {

		for(int i=0;i<=a.length;i++) {
			int[] add = new int[4];
			add[i] = a[i] + b[i];
			System.out.print(add[i] + "  ");
		}
		return null ;
	}
}
