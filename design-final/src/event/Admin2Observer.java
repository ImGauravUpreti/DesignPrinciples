package event;

public class Admin2Observer implements INotificationObserver {
	public String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Admin2Observer() {
		this.name = "admin2";
	}

	@Override
	public void onMoreThan100Tickets() {
		System.out.println(name + ": Notification received.");

	}

}
