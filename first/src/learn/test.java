package learn;

public class test {

	public static void main(String[] args) {
		int s = 5;
		star(s);
	}
	public static void star(int s) {
		for(int i = 0; i<s;i++) {
			for(int j = 0;j<=i;j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}





