package learn;

public class inhert {
	public static void main(String args[]) {
		int r = 56;
		int l = 66;
		int b = 77;
		rectangle rect = new rectangle();
		rect.cir(r);
		rect.rect(l, b);
	}
}
class circle {
	public static double cir(int r) {
		double area = Math.PI*r*r;
		System.out.println(area);
		return area;	
	}
}
class rectangle extends circle{
	public static float rect(int l,int b) {
		float rectangle = l*b;
		System.out.println(rectangle);
		return rectangle;	
	}
}
