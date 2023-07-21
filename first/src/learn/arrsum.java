package learn;

public class arrsum {
	public static void main(String[] args) {
		osum o = new osum();
		o.sum();
		o.sum1();
		o.sum2();
	}
}
class sum_element{
	public void sum() {
		int a[] = {3,4,6,5};
		int res = 0, i = 0;
		while(i<a.length) {
			res += a[i];
			i++;
		}
		System.out.println("Sum of elements : "+res);		
	}		
}
class esum extends sum_element{
	public void sum1() {
		int b[] = {3,4,6,5};
		int res = 0;
		for(int i = 0;i<b.length;i++) {
			if(b[i]%2 == 0) {
				res += b[i];
			}	
		}
		System.out.println("sum of even elements: "+res);
	}		
}
class osum extends esum{
	public void sum2() {
		int b[] = {3,4,6,5};
		int res = 0;
		for(int i = 0;i<b.length;i++) {
			if(b[i]%2 != 0) {
				res += b[i];
			}	
		}
		System.out.println("sum of odd elements: "+res);
	}		
}





