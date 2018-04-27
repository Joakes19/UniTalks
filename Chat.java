
public class Chat{
	int chatID;//This is the ID of the group that uses the group chatID
	ArrayList<Message> messages;
	
	public Chat(int inputChatID, ArrayList<Message> previousMessages){
		chatID = inputChatID;
		messages = previousMessages;
	}
	
	public sendMessage(int userID, Message newMessage){
		messages.add(newMessage);
	}
}