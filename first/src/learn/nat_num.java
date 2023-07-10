package learn;

public class nat_num {
	public static void main(String args[]) {
		num(1);
	}

	public static void num(int a) {
		if(a<=100) {
			System.out.println(a + " ");
			a++;
			num(a);
		}
	}
}
