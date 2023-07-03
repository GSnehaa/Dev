package learn;

//public class largest{
//	public static void main(String args[]) {
//	int a []= {11,22,33,44,55,66};
//	int res = a[0];
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>res) {
//				res = a[i];
//									
//			}
//		}
//		System.out.println(res);						
//	}
//}
////			
//--------------
public class largest{
	public static void main(String[] args) {
		int[] b =  {12,34,17};	
		int res = number(b);
		System.out.println(res);
	}
	
public static int number(int a[]) {
	int res = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>res) {
			res = a[i];
			break;
		}
	}
	return res;	
}
}

