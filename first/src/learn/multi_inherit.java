package learn;

public class multi_inherit {
	public static void main(String args[]) {
		vechicle v = new bike();
		v.ride();		
	}
}
interface vechicle{
	void ride();
}
class car implements vechicle{
	public void ride() {
		System.out.println("Car ride");
	}
}
class bike implements vechicle{
	public void ride() {
		System.out.println("bike ride");
	}
}


