package learn;

public class accessmod {

	public static void main(String[] args) {
		int a = 10,b = 10;
		pub p = new pub();
		p.add(a, b);
		priv pr = new priv();
		pr.bbb();
	
	}
}
class pub{
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
}
class priv{
	int a = 10;
	private void aaa() {
		System.out.println(a);
	}
	public void bbb() {
		aaa();
	}
}
class prot{
	int x = 30;
	protected void ccc() {
		System.out.println(x);
	}
}
