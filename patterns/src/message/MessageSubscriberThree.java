package message;

public class MessageSubscriberThree implements Observer{
	private State observerState;
	private Subject subject;

	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());

	}

	MessageSubscriberThree(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void updateState(State s) {
		System.out.println("MessageSubscriberThree :: " + s.getState());
		
	}


}
