import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
// Post has poster, title, description and comments
class Post {
	String poster;
	String title;
	String body;
	ArrayList<Comment> comments = new ArrayList<Comment>();
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	public Post(String poster, String title, String body){
		this.title = title;
		this.body = body;
		this.poster = poster;
	}
	
	// GETTERS ////////////////////
	public String getTitle(){
		return this.title;
	}
	public String getBody(){
		return this.body;
	}
	public String getPoster(){
		return this.poster;
	}
	public ArrayList<Comment> getComments(){
		return comments;
	}
	///////////////////////////////
	
	
	// Add a comment in the form of a string
	public void addComment(String commentBody){

		Comment comment = new Comment(commentBody);
		comments.add(comment);
		
	}
	// Delete a comment
	public void deleteComment(Comment targetComment){
		for(int i = 0; i < comments.size(); i++){
			if (comments.get(i) == targetComment){
				comments.remove(i);
			}
		}
	}
	
	
}
