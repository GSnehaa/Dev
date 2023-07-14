package learn;

public class multi_inherit {
	public static void main(String args[]) {
		vehicle v = new bike();
		vehicle vv = new car();
		vv.ride();
		v.ride();		
	}
}
interface vehicle{
	void ride();
}
class car implements vehicle{
	public void ride() {
		System.out.println("Car ride");
	}
}
class bike implements vehicle{
	public void ride() {
		System.out.println("bike ride");
	}
}


