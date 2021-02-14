package abstractFactory;

public class MiniCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		return new MiniCar(location);
	}

}
