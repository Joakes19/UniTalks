import java.sql.*;
import java.util.*;

public class ForumsRecord{
	int ForumID;
	String ForumName, ForumDescription;
	public ForumsRecord(int inputForumID, String inputForumName, String inputForumDescription){
		ForumID = inputForumID;
		ForumName = inputForumName;
		ForumDescription = inputForumDescription;
	}
	
	public int getForumID(){
		return ForumID;
	}
	
	public String getForumName(){
		return ForumName;
	}
	
	public String getForumDescription(){
		return ForumDescription;
	}
	
	public void setForumID(int newForumID){
		ForumID = newForumID;
	}
	
	public void setForumName(String newForumName){
		ForumName = newForumName;
	}
	
	public void setForumDescription(String newForumDescription){
		ForumDescription = newForumDescription;
	}
}