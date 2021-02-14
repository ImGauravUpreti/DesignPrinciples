package retail;

public class ElectronicOrder extends Order {

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		return new Electronics(channel);
	}

}
