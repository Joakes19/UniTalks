import java.sql.*;
import java.util.*;

public class ForumParticipationRecord{
	int ClientID, ForumID;
	public ForumParticipationRecord(int inputClientID, int inputForumID){
		ClientID = inputClientID;
		ForumID = inputForumID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getForumID(){
		return ForumID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void  setForumID(int newForumID){
		ForumID = newForumID;
	}
}