package retail;

public class Toys extends Product {

	public Toys(Channel channel) {
		super(channel, ProductType.TOYS);
		this.processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Processing toys order.");

	}

}
