package retail;

public class Furniture extends Product {

	public Furniture(Channel channel) {
		super(channel, ProductType.FURNITURE);
		this.processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Processing furniture order.");

	}

}
