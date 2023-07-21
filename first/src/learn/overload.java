package learn;

public class overload {
	public static void main(String args[]) {
		addition.add(10,10);
		addition.add(10,10,10);
	}
}
class addition{
	public static void add(int a, int b) {
		int c = a+b;	
		System.out.println(c);
	}
	public static double add (int a,int b, int d) {	
		int e = a+b+d;
		System.out.println(e);
		return e;
	}	
}

