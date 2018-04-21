import java.sql.*;
import java.util.*;

public class GroupChatsRecord{
	int GroupChatID, GroupChatTypeID;
	String GroupChatDescription, GroupChatName;
	public GroupChatsRecord(int inputGroupChatID, String inputGroupChatDescription, String inputGroupChatName, int inputGroupChatTypeID){
		int GroupChatID = inputGroupChatID;
		String GroupChatDescription = inputGroupChatDescription;
		String GroupChatName = inputGroupChatName;
		int GroupChatTypeID = inputGroupChatTypeID;
	}
	
	public int getGroupChatID(){
		return GroupChatID;
	}
	
	public String getGroupChatDescription(){
		return GroupChatDescription;
	}
	
	public String getGroupChatName(){
		return GroupChatName;
	}
	
	public int getGroupChatTypeID(){
		return GroupChatTypeID;
	}
	
	public void setGroupChatID(int newGroupChatID){
		GroupChatID = newGroupChatID;
	}
	
	public void setGroupChatDescription(String newGroupChatDescription){
		GroupChatDescription = newGroupChatDescription;
	}
	
	public void setGroupChatName(String newGroupChatName){
		GroupChatName = newGroupChatName;
	}
	
	public void setGroupChatTypeID(int newGroupChatTypeID){
		GroupChatTypeID = newGroupChatTypeID;
	}
}