package learn;

public class arrcountdup {

	public static void main(String[] args) {
		int a [] =  {3,4,4,5,6,3,6};
		duplicate(a);
	}
	public static int duplicate(int a[]) {
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					count ++;
					System.out.println(a[j]);
				}
			}
		}
		System.out.println("count of duplicate: "+count);
		return count;		
	}
}

