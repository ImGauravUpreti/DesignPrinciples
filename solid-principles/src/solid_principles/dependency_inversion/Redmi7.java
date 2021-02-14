package solid_principles.dependency_inversion;

public class Redmi7 implements IPhone {

	@Override
	public String getPhonePart1() {
		return "Audio Jack";
	}

	@Override
	public double getPart1Cost() {
		return 600;
	}

}
