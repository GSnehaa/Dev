package learn;

public class arrelements {

	public static void main(String[] args) {
		String[] a = new String[]{"aa","bb","cc"};
		elements(a);
	}
	public static void elements(String a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
