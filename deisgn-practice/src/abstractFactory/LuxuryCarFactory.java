package abstractFactory;

public class LuxuryCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		return new LuxuryCar(location);
	}

}
