package learn;

import java.util.Arrays;

public class arrunique {
	public static void main(String args[]) {
		int a [] = {4,5,4,3,6,5};
		uni(a);
	}
	public static void uni(int a[]) {
		Arrays.sort(a);
		int c[] = new int[a.length];
		int u[] = new int[a.length];
		int j = 0,k = 0;
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				c[j++] = a[i];
				i++;
			}
			else {
				u[k++] = a[i];
			}
		}
		u[k++] = a[a.length-1];
		System.out.println(Arrays.toString(u));
	}
}




