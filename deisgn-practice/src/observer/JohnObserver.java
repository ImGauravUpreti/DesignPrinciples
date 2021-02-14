package observer;

public class JohnObserver implements INotificationObserver {
	public String name;
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JohnObserver() {
		this.name = "John";
	}

	@Override
	public void onServerDown() {
		System.out.println(name + ": Notification received.");

	}

}
