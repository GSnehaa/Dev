package learn;

public class poly1 {
	public static void main(String args[]) {
	int a [] = new int[] {32,-4,6,89,-57};
	positive p = new negative(); 
	p.num(a);	
	}
}
class positive{
	public void  num(int a []) {	
		for(int i = 0;i<a.length;i++) {
			if(a[i]>=0) {
				System.out.println(a[i] + " is an positive number");
			}

		}
	}
}
class negative extends positive{
	public void num(int a[]) {
		for(int i = 0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i] + " is an negative number");
			}
		}
		
	}
}

