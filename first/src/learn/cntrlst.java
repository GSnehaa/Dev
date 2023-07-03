package learn;

public class cntrlst {

	public static void main(String[] args) {
		
//		int result = getindex(45);
		int i =12345;
		reverse(i);
//		 int u =i++;
//		int ii= ++i;
//		int y =--i;
//		int h = i--;
		
	}
	
	public static int reverse(int a) {
		int rev=0;
		while(a > 0) {
			int rem = a % 10;
			rev  = rev* 10 +  rem;
			a/=10;
		}
		return rev;
	}
	
	public static Integer getindex(int var) {
		Integer r = null;
		int a [] = {12,34,45,56,6,6};
		if(a.length > 0) {
			for(int i=0;i< a.length;i++) {
				if(a[i] == var) {
					r = i;
					break;
				}
			}
		}
		return r;
	}
		
}

//methods or functions 

//1. with return with parameters
		
		
		
		
		
		
		
		
		
		
		
//		date time 
		
//		int a [] = {12,67,78,0,89};
//		
//		if(a.length > 0) {
//			for(int i =0;i< a.length;i++) {
//				
//			}
//		}
		
		
//		if 
//		else if 
//		while 
//		for 
//		do while 
//		int a =112;
//		if(a < 13) {
//			System.out.println(a);
//		}else {
//			System.out.println("----");
//		}
		
//		nested if 
//		int a = 12;
//		int b =23;
//		
//		if(a  < 15 && a == 12) {
//			if(b == 23) {
//				
//			}
//		}
		
//for(int i=0;i< 10;i++) {
//	
//}
//int a =1;
//while (a < 10) {
//	System.out.print(a);
//	a++;
//}


//step 1:
//a = 112 112 < 13 false else


