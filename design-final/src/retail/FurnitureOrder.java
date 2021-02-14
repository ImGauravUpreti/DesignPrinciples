package retail;

public class FurnitureOrder extends Order {

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		return new Furniture(channel);
	}

}
