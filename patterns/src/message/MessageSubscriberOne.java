package message;

public class MessageSubscriberOne implements Observer{
	private State observerState;
	private Subject subject;

	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

	}

	MessageSubscriberOne(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void updateState(State s) {
		System.out.println("MessageSubscriberOne :: " + s.getState());
		
	}

}
