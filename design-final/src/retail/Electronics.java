package retail;

public class Electronics extends Product {

	public Electronics(Channel channel) {
		super(channel, ProductType.ELECTRONICS);
		this.processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Processing electronics order.");

	}

}
