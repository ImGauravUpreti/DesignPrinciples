package retail;

public class ToysOrder extends Order {

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		return new Toys(channel);
	}

}
