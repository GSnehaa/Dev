package learn;

public class smallest {
	public static void main(String[] args) {
		int[] a =  {12,34,17};	
		int res = number(a);
		System.out.println(res);
	}
	
public static int number(int a[]) {
	int res = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<res) {
			res = a[i];
			break;
		}
	}
	return res;	
}
}
