import java.sql.*;
import java.util.*;

public class ForumCommentsRecord{
	int ClientID, PostID;
	String CommentContent;
	Date CommentDate;
	public ForumCommentsRecord(int inputClientID, int inputPostID, String inputCommentContent, Date inputCommentDate){
		ClientID = inputClientID;
		PostID = inputPostID;
		CommentContent = inputCommentContent;
		CommentDate = inputCommentDate;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getPostID(){
		return PostID;
	}
	
	public String getCommentContent(){
		return CommentContent;
	}
	
	public Date getCommentDate(){
		return CommentDate;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setPostID(int newPostID){
		PostID = newPostID;
	}
	
	public void setCommentContent(String newCommentContent){
		CommentContent = newCommentContent;
	}
	
	public void setCommentDate(Date newCommentDate){
		CommentDate = newCommentDate;
	}
}