package learn;

public class multi_inhert {
	public static void main(String args []) {
		son obj =new son();
		System.err.print(obj.reverse1(123));
		obj.reverse2(456);
		obj.reverse3(345);
	}
}

class grandfather{
	
	public int reverse1(int a) {
		int rev =0;
		while(a > 0) {
			int rem =a %10 ;
			rev= rev* 10 + rem;
			a/=10;
		}
		return rev;
	}
}


class father extends grandfather{
	
	public int reverse2(int a) {
		int rev =0;
		while(a > 0) {
			int rem =a %10 ;
			rev= rev* 10 + rem;
			a/=10;
		}
		return rev;
	}
}

class son extends father{
	
	public int reverse3(int a) {
		int rev =0;
		while(a > 0) {
			int rem =a %10 ;
			rev= rev* 10 + rem;
			a/=10;
		}
		return rev;
	}
}