package learn;

public class divisible {
	public static void main(String args[]) {
		number(98);
	}

public static void number(int a) {
	if(a%5==0 && a%11==0) {
			System.out.print(a + " is divisible by 5 and 11");
		}
	else {
		System.out.println(a + " is not divisible by 5 and 11");
	}
}
}
