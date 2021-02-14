package abstractFactory;

public class CarClient {

	public static void main(String[] args) {
		CarFactory carFactory = new MicroCarFactory();
		System.out.println(carFactory.buildCar(CarType.MICRO, Location.USA));

		carFactory = new MiniCarFactory();
		System.out.println(carFactory.buildCar(CarType.MINI, Location.INDIA));

		carFactory = new LuxuryCarFactory();
		System.out.println(carFactory.buildCar(CarType.LUXURY, Location.DEFAULT));

	}

}
