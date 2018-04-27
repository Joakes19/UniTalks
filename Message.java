
public class Message{
	int creatorID, groupID;
	String messageContents;
	
	public Message(int inputCreatorID, int inputGroupID, String inputMessageContents){
		creatorID = inputCreatorID;
		groupID = inputGroupID;
		messageContents = inputMessageContents;
	}
	
	public String getMessage(){
		return messageContents;
	}
	
	public int getCreatorID(){
		return creatorID;
	}
	
	public int getGroupID(){
		return groupID;
	}
	
	public void setMessage(String newMessage){
		messageContents = newMessage;
	}
	
	public void setCreatorID(int newCreatorID){
		creatorID = newCreatorID;
	}
	
	public void setGroupID(int newGroupID){
		groupID = newGroupID;
	}
}