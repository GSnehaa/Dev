package learn;

public class polymorphism {
	public static void main(String args[]) {
	drawing d = new rectangles();
	d.draw();	
	}
}
class drawing {
	public void draw() {
		System.out.println("drawing");
	}
}
class rectangles extends drawing{
	public void draw() {
		System.out.println("Rectangle draw");
	}
}

