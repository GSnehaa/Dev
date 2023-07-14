package learn;

public class inherit1 {
	public static void main(String args[]) {
		arrayodd odd = new arrayodd();
		odd.num();
		odd.num1();		
	}
}
class arrayeven{
	public void num() {
		int a[] = new int[] {10,45,22,68,75};
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i]+ " " );
				count ++;
			}
		}
		System.out.println("the count of even numbers : " + count);
	}
}
class arrayodd extends arrayeven{
	public void num1() {
		int aa[] = new int[] {18,45,29,68,75};
		int count = 0;
		for(int i = 0;i<aa.length;i++) {
			if(aa[i]%2 != 0) {
				System.out.print(aa[i]+ " " );
				count ++;
			}
		}
		System.out.println("the count of odd numbers : " + count);
	}
}
