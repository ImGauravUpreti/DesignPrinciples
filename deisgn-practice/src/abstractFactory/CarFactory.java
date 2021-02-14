package abstractFactory;

public abstract class CarFactory {
	public abstract Car buildCar(CarType carType, Location location);

}
