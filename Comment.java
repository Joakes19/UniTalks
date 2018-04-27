import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
// Comment has a body, a date and user
class Comment {
	String user;
	String body;
	ArrayList<Comment> replies = new ArrayList<Comment>();
	String dateTime = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z").format(new Date());
	
	public Comment(String user, String body){
		this.body = body;
	}
	// GETTERS ////////////////////
	public String getUser(){
		return this.user;
	}
	public String getBody(){
		return this.body;
	}
	public String getReplies(){
		return replies;
	}
	public String getCommentDateTime(){
		return dateTime;
	}
	///////////////////////////////
	
	
	// Add a reply to this comment
	public void addReply(Comment reply){
		replies.add(reply);
	}
	// Delete a reply to this comment
	public void deleteReply(Comment targetReply){
		for(int i = 0; i < replies.size(); i++){
			if (replies.get(i) == targetReply){
				replies.remove(i);
			}
		}
	}
}