package learn;

import java.util.Arrays;

public class arrcopy {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		copy(a);
	}
	public static void copy(int a[]) {
		int b[]=new int[a.length];
		for(int i = 0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
