package chat;

public class ChatApplication {
	public static void main(String[] args) {
		IUser user1 = new PremiumUser("Stark");
		IUser user2 = new BasicUser("Tyrion");
		IUser user3 = new BasicUser("Daenerys");
		IUser user4 = new BasicUser("Renly");
		IUser user5 = new PremiumUser("Cercei");

		ChatMediator chatMediator = new ChatMediator();
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);

		user1.sendMessage("Winter is coming!");
	}

}
