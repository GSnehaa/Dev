package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		List<product> prod = new ArrayList<product>();
		prod.add(new product(1,10000f));
		prod.add(new product(2,70000f));
		prod.add(new product(3,40000f));
		List<Float> plist = prod.stream().filter(p -> p.price > 35000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(plist);						

	}

}
class product{
	int id;
	float price;

	public product (int id, float price) {
		this.id = id;		
		this.price = price;
	}
}
