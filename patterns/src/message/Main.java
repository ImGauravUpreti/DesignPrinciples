package message;

public class Main {

	public static void main(String[] args)

	{
		MessagePublisher p = new MessagePublisher();

		MessageSubscriberOne s1 = new MessageSubscriberOne(p);

		MessageSubscriberTwo s2 = new MessageSubscriberTwo(p);

		MessageSubscriberThree s3 = new MessageSubscriberThree(p);

		p.attach(s1);

		p.attach(s2);

		p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update
		p.notifyStateUpdate(new State("Active"));

		p.detach(s1);

		p.attach(s3);

		p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update
		p.notifyStateUpdate(new State("Inactive"));

	}

}
