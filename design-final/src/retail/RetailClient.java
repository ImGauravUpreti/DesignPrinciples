package retail;

public class RetailClient {

	public static void main(String[] args) {
		Order order = new ElectronicOrder();
		System.out.println(order.processOrder(Channel.TELE_CALLER, ProductType.ELECTRONICS));

		order = new FurnitureOrder();
		System.out.println(order.processOrder(Channel.E_COMMERCE, ProductType.FURNITURE));

		order = new ToysOrder();
		System.out.println(order.processOrder(Channel.E_COMMERCE, ProductType.TOYS));

	}

}
