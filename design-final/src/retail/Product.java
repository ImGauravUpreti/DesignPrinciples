package retail;

enum ProductType {
	ELECTRONICS, TOYS, FURNITURE
}

enum Channel {
	E_COMMERCE, TELE_CALLER
}

public abstract class Product {
	private Channel channel;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	private ProductType productType;

	public Product(Channel channel, ProductType productType) {
		this.channel = channel;
		this.productType = productType;
	}

	public abstract void processOrder();

	@Override
	public String toString() {
		return "Product [channel=" + channel + ", productType=" + productType + "]";
	}

}
