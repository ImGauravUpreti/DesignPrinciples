package chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	private static List<IUser> users;

	@Override
	public void addUser(IUser user) {
		users.add(user);

	}

	@Override
	public void sendMessage(String msg) {
		for (IUser user : users) {
			user.receiveMessage(msg);
		}

	}

	public ChatMediator() {
		users = new ArrayList<IUser>();
	}

}
