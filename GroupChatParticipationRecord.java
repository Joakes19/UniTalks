import java.sql.*;
import java.util.*;

public class GroupChatParticipationRecord{
	int ClientID, GroupChatID;
	public GroupChatParticipationRecord(int inputClientID, int inputGroupChatID){
		ClientID = inputClientID;
		GroupChatID = inputGroupChatID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getGroupChatID(){
		return GroupChatID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setGroupChatID(int newGroupChatID){
		GroupChatID = newGroupChatID;
	}
}