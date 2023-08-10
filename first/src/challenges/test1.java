package challenges;
// rearrange to form palindrome
public class test1 {
	
	public static void main(String args[]) {
		String st = "rearcac";
		word(st);
	}
	public static void word(String st) {
		char c [] = st.toCharArray();
		int d = 0, b =0;
		int i;
		for(i = 0; i<st.length();i++) {
			for(int j = i+1; j<st.length();j++) {
				if(c[i] == c[j]) {
					d+=1;
				}
				else {
					b+=1;
				}
			}
		}
		if(d%2 !=0) {
			System.out.println("Palindrome is possible");
		}
		else if(b%2== 0 && d%2 == 0) {
			System.out.println("Palindrome is possible");
		}
		else {
			System.out.println("Palindrome is not possible");
		}
	}
}


