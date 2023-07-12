package learn;

public class encapculation {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public static void main(String args[]) {
	encapculation en = new encapculation();
	en.setName("vuub");
	String s = en.getName();
}
}



