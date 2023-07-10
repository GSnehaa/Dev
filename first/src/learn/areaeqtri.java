package learn;
import java.util.Scanner;
public class areaeqtri {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area: ");
		int a = sc.nextInt();
		eqtri(a);
	}

	public static double eqtri(int a) {
		double eqtriangle = (1.73*a*a)/4;
		System.out.println(eqtriangle);
		return eqtriangle;	
	}

}
