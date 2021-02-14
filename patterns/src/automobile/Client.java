package automobile;

public class Client {
	public static void main(String[] args) {
		Factory audiFactory = new AudiFactory();
		audiFactory.makeHeadlight();
		audiFactory.makeTire();

		Factory mercedesFactory = new MercedesFactory();
		mercedesFactory.makeHeadlight();
		mercedesFactory.makeTire();

	}
}
