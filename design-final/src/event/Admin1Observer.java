package event;

public class Admin1Observer implements INotificationObserver {
	public String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Admin1Observer() {
		this.name = "admin1";
	}

	@Override
	public void onMoreThan100Tickets() {
		System.out.println(name + ": Notification received.");

	}

}
