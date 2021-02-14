package event;

public interface INotificationService {
	public void addSubscriber(INotificationObserver observer);

	public void removeSubscriber(INotificationObserver observer);

	public void notifySubscriber(int ticketCount);
}
