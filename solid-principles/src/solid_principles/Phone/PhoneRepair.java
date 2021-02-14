package solid_principles.Phone;

public class PhoneRepair implements IRepair {

	@Override
	public String ProcessPhoneRepair(String modelName) {
		String result = modelName + " repair accepted!";
		return result;

	}

	@Override
	public String ProcessAccessoryRepair(String accessoryType) {
		String result = accessoryType + " repair accepted!";
		return result;

	}

}
