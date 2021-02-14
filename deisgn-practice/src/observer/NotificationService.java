package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> subscribers;

	@Override
	public void addSubscriber(INotificationObserver observer) {
		subscribers.add(observer);
		System.out.println("Subscribers List:");
		for (INotificationObserver subscriber : subscribers) {
			System.out.println(subscriber.getName());
		}

	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		subscribers.remove(observer);
		System.out.println("Subscribers List:");
		for (INotificationObserver subscriber : subscribers) {
			System.out.println(subscriber.getName());
		}

	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver subscriber : subscribers) {
			subscriber.onServerDown();
		}

	}

	public NotificationService() {
		super();
		this.subscribers = new ArrayList<INotificationObserver>();
	}

}
