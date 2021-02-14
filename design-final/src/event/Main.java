package event;

public class Main {
	public static void main(String[] args) {

		INotificationObserver admin1 = new Admin1Observer();
		INotificationObserver admin2 = new Admin2Observer();
		NotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(admin1);
		notificationService.addSubscriber(admin2);
		notificationService.notifySubscriber(200);
		notificationService.notifySubscriber(90);
		notificationService.removeSubscriber(admin2);

	}
}
