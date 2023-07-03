package learn;
//-------- odd or even ---------
//public class oddeven {
//
//	public static void main(String[] args) {
//		int a = 23;
//		if(a%2==0) {
//			System.out.println(a + " is a even number");
//		}
//		else {
//			System.out.println(a + " is a odd number");
//		}
//
//	}
//
//}
//-----------
public class oddeven {
	public static void main(String args[]) {
		String result = number(247);
		System.out.println(result);
		
	}
	public static String number(int a) {
		String res = "null";
		if (a%2==0) {
				res = "even";
		}
		else {
			res = "odd";
		}
		return res;
	}
}
