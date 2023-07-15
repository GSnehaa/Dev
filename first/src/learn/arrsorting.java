package learn;

import java.util.Arrays; 
import java.util.Collections;

public class arrsorting {	
	public static void main(String args[]) {
		ascending as = new decending();
		as.sort();		
	}
}
class ascending{
public void sort() {
		int a[] = {3,1,6,9,8,7,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
class decending extends ascending{
	public void sort() {
		Integer [] a = {78, 102, 4, 6, 110, 205};   
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}

