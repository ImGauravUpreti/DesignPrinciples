package message;

public class MessageSubscriberTwo implements Observer {
	private State observerState;
	private Subject subject;

	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());

	}

	MessageSubscriberTwo(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void updateState(State s) {
		System.out.println("MessageSubscriberTwo :: " + s.getState());
		
	}

}
