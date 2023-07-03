package learn.test1;

public class largest {
	public static void main(String args[]) {
		int [] b = {19,56,34};
		int r = number(b);
		System.out.println(r);
		
	}

	public static int number(int a[]) {
		int r = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>r) {
				r = a[i];
			}
		}
		return r;
	}
}

