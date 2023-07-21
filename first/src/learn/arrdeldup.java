package learn;

import java.util.Arrays;

public class arrdeldup {
	public static void main(String args[]) {
		int a[] = {2,5,3,7,6,3,6};
		dup(a);
	}
	public static void dup(int a[]) {
		Arrays.sort(a);
		if(a.length == 0 || a.length == 1) {
			System.out.println(a.length);
		}
		int c[] = new int[a.length];
		int j = 0;
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] != a[i+1]) {
				c[j++] = a[i];
			}
		}
		c[j++]=a[a.length - 1];
		for(int i = 0; i<j;i++) {
			a[i] = c[i];
			System.out.print(a[i] + " ");
		}
	}
}


