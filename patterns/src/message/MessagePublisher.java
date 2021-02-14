package message;

import java.util.ArrayList;

import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override

	public void attach(Observer o) {

		observers.add(o);

	}

	@Override

	public void detach(Observer o) {

		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}
	
	@Override
	public void notifyStateUpdate(State s) {
		for (Observer o : observers) {
			o.updateState(s);
		}
	}
}
