import java.sql.*;
import java.util.*;

public class GroupChatTypesRecord{
	int GroupChatTypeID;
	String GroupChatTypeName;
	public GroupChatTypesRecord(int inputGroupChatTypeID, String inputGroupChatTypeName){
		GroupChatTypeID = inputGroupChatTypeID;
		GroupChatTypeName = inputGroupChatTypeName;
	}
	
	public int getGroupChatTypeID(){
		return GroupChatTypeID;
	}
	
	public int getGroupChatTypeName(){
		return GroupChatTypeID;
	}
	
	public void setGroupChatTypeID(int newGroupChatTypeID){
		GroupChatTypeID = newGroupChatTypeID;
	}
	
	public void setGroupChatTypeName(String newGroupChatTypeName){
		GroupChatTypeName = newGroupChatTypeName;
	}
}