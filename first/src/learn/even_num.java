package learn;

public class even_num {
	public static void main(String args[]) {
		numbers(100);
		
	}

public static void numbers(int a) {
	for(int i=1;i<=a;i++) {
		if(i%2 == 0) {
			System.out.print(i + " ");		
		}
	}
}
}
