package solid_principles.dependency_inversion;

public class SamsungNote implements IPhone {

	@Override
	public String getPhonePart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 500;
	}

}
