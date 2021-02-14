package observer;

public class Main {
	public static void main(String[] args) {

		SteveObserver steve = new SteveObserver();
		JohnObserver john = new JohnObserver();
		NotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(steve);
		notificationService.addSubscriber(john);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(steve);

	}
}
