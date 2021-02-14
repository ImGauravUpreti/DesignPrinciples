package observer;

public class SteveObserver implements INotificationObserver {
	private String name;
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SteveObserver() {
		this.name = "Steve";
	}

	@Override
	public void onServerDown() {
		System.out.println(name + ": Notification received.");

	}

}
