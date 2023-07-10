package learn;

public class inheritance {

	public static void main(String[] args) {
		child obj = new child();
		boolean bl = obj.oddoreven(12.0);
		if(bl == true) {
			System.err.println("--------even number-----");
		}else {
			System.err.println("--------odd number-----");
		}
		
		int b = obj.reverse(123);
		System.err.println("--------reverse number-----" + b);
		
		child2 obj2 = new child2();
		boolean bl1 = obj2.oddoreven(13.0);
		if(bl1 == true) {
			System.err.println("--------even number-----");
		}else {
			System.err.println("--------odd number-----");
		}
		
		int bb = obj2.reverse2(456);
		System.err.println("--------reverse number----- bb " + bb);
		
	}

}

class parent{
	
	public boolean oddoreven(double a) {
		boolean bool = false;
		if(a%2 ==0) {
			bool =true;
			return bool;
		}
		return bool;
	}
}

class child extends parent{
	
	public int reverse(int a) {
		int rev =0;
		while(a > 0) {
			int rem =a %10 ;
			rev= rev* 10 + rem;
			a/=10;
		}
		return rev;
	}
}

class child2 extends parent{
	
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

// inheritance -- 
// single 
