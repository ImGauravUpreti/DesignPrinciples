package abstractFactory;

public class MicroCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		return new MicroCar(location);
	}

}
