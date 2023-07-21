package learn;
import java.util.Scanner;

public class atm {
	public static void main(String args[]) {	
		customer obj = null;
		customer [] arr = new customer[2];
		
		arr[0] = new customer("aa",2000);
		arr[1] = new customer("bb",5000);
		int a = arr.length;
		obj.process(arr);
	}
}
class customer{
	public String name;
	public long amount;
	
	customer(String name, long amount){
		this.name = name;
		this.amount = amount;
	}
	public void process(customer [] onj) {
//		long credit;
		int y=0;
		Scanner sc = new Scanner(System.in);	
			System.out.println("Choose 1 for Credit");
			System.out.println("Choose 2 for deposit");
			System.out.println("Choose 3 for balance");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter the person name: ");
				String cname = sc.next();
					if(onj[0].name == cname) {
						System.out.println("...");
				}
					else {
						System.out.println("kkk");
					}
			}
	}		
}





	




