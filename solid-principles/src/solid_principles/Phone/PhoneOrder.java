package solid_principles.Phone;

public class PhoneOrder implements IOrder {

	@Override
	public String ProcessOrder(String modelName) {
		String result = modelName + " repair accepted!";
		return result;

	}

}
