import java.sql.*;
import java.util.*;

public class ForumPostRecord{
	int CreatorID, ForumID;
	String PostContent;
	public ForumPostRecord(int inputCreatorID, String inputPostContent, int inputForumID){
		CreatorID = inputCreatorID;
		PostContent = inputPostContent;
		ForumID = inputForumID;
	}
	
	public int getCreatorID(){
		return CreatorID;
	}
	
	public String getPostContent(){
		return PostContent;
	}
	
	public int getForumID(){
		return ForumID;
	}
	
	public void setCreatorID(int newCreatorID){
		CreatorID = newCreatorID;
	}
	
	public void setPostContent(String newPostContent){
		PostContent = newPostContent;
	}
	
	public void setForumID(int newForumID){
		ForumID = newForumID;
	}
}